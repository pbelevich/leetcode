package com.leetcode.problems.regularExpressionMatching;

public class Solution {

    interface Node {

        boolean match(char[] chars, int i);

        boolean matchAndNext(char[] chars, int i);

    }

    Node TERMINAL = new Node() {

        @Override
        public boolean match(char[] chars, int i) {
            return i == chars.length;
        }

        @Override
        public boolean matchAndNext(char[] chars, int i) {
            return match(chars, i);
        }

    };

    static abstract class Nonterminal implements Node {

        Node next;

        public Nonterminal(Node next) {
            this.next = next;
        }

    }

    static class Char extends Nonterminal {

        final char c;

        public Char(char c, Node next) {
            super(next);
            this.c = c;
        }

        @Override
        public boolean match(char[] chars, int i) {
            return i < chars.length && c == chars[i];
        }

        @Override
        public boolean matchAndNext(char[] chars, int i) {
            return match(chars, i) && next.matchAndNext(chars, i + 1);
        }

    }

    static class Any extends Nonterminal {

        public Any(Node next) {
            super(next);
        }

        @Override
        public boolean match(char[] chars, int i) {
            return true;
        }

        @Override
        public boolean matchAndNext(char[] chars, int i) {
            return match(chars, i) && next.matchAndNext(chars, i + 1);
        }

    }

    static class Star extends Nonterminal {

        final Node node;

        public Star(Node node, Node next) {
            super(next);
            this.node = node;
        }

        @Override
        public boolean match(char[] chars, int i) {
            return true;
        }

        @Override
        public boolean matchAndNext(char[] chars, int i) {
            for (int j = 0; ; j++) {
                boolean result = true;
                for (int k = 0; k < j && result; k++) {
                    result = i + k < chars.length && node.match(chars, i + k);
                }
                if (!result) {
                    return false;
                }
                result = next.matchAndNext(chars, i + j);
                if (result) {
                    return true;
                }
            }
        }

    }

    Node compile(char[] chars, int i) {
        if (i == chars.length) {
            return TERMINAL;
        } else {
            if (i + 1 <= chars.length - 1 && chars[i + 1] == '*') {
                if (chars[i] == '.') {
                    return new Star(new Any(null), compile(chars, i + 2));
                } else {
                    return new Star(new Char(chars[i], null), compile(chars, i + 2));
                }
            } else {
                if (chars[i] == '.') {
                    return new Any(compile(chars, i + 1));
                } else {
                    return new Char(chars[i], compile(chars, i + 1));
                }
            }
        }
    }

    public boolean isMatch(String s, String p) {
        return compile(p.toCharArray(), 0).matchAndNext(s.toCharArray(), 0);
    }

}