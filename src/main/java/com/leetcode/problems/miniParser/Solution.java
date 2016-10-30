package com.leetcode.problems.miniParser;

public class Solution {

    private static class State {

        final char[] chars;
        int curr;

        State(char[] chars) {
            this.chars = chars;
            this.curr = 0;
        }

        NestedInteger deserialize() {
            NestedInteger result;
            if (chars[curr] == '[') {
                result = new NestedInteger();
                curr++;
                while (chars[curr] != ']') {
                    result.add(deserialize());
                    if (chars[curr] == ',') {
                        curr++;
                    }
                }
                curr++;
            } else {
                int start = curr;
                while (curr < chars.length && chars[curr] != ']' && chars[curr] != ',') {
                    curr++;
                }
                result = new NestedInteger(parseInt(chars, start, curr));
            }
            return result;
        }

    }

    public NestedInteger deserialize(String s) {
        NestedInteger result = null;
        if (s != null && !s.isEmpty()) {
            char[] chars = s.toCharArray();
            result = new State(chars).deserialize();
        }
        return result;
    }

    static int parseInt(char[] chars, int start, int end) throws NumberFormatException
    {
        final int radix = 10;
        int result = 0;
        boolean negative = false;
        int i = start;
        int digit;

        if (end - start > 0) {
            char firstChar = chars[start];
            if (firstChar < '0') {
                if (firstChar == '-') {
                    negative = true;
                }
                i++;
            }
            while (i < end) {
                digit = Character.digit(chars[i++], radix);
                result *= radix;
                result -= digit;
            }
        }
        return negative ? result : -result;
    }

}