package com.leetcode.problems.romanToInteger;

public class Solution {

    private static int encode(char c) {
        switch (c) {
            case 'I': return 0;
            case 'V': return 1;
            case 'X': return 2;
            case 'L': return 3;
            case 'C': return 4;
            case 'D': return 5;
            case 'M': return 6;
            default: return -1;
        }
    }

    private static class Node {

        Node[] children = new Node[8];
        int value;

        void insert(String s, int value) {
            insert(s.toCharArray(), value);
        }

        void insert(char[] chars, int value) {
            insert(chars, 0, value);
        }

        void insert(char[] chars, int start, int value) {
            Node child = children[encode(chars[start])];
            if (child == null) {
                child = new Node();
                children[encode(chars[start])] = child;
            }
            if (start == chars.length - 1) {
                child.value = value;
            } else {
                child.insert(chars, start + 1, value);
            }
        }

        int find(String s) {
            return find(s.toCharArray(), 0);
        }

        int find(char[] chars, int start) {
            if (start == chars.length) {
                return value;
            } else {
                Node child = children[encode(chars[start])];
                if (child == null) {
                    return value + tree.find(chars, start);
                } else {
                    return child.find(chars, start + 1);
                }
            }
        }

    }

    private static Node tree = new Node();

    static {
        tree.insert("I", 1);
        tree.insert("II", 2);
        tree.insert("III", 3);
        tree.insert("IV", 4);
        tree.insert("V", 5);
        tree.insert("VI", 6);
        tree.insert("VII", 7);
        tree.insert("VIII", 8);
        tree.insert("IX", 9);

        tree.insert("X", 10);
        tree.insert("XX", 20);
        tree.insert("XXX", 30);
        tree.insert("XL", 40);
        tree.insert("L", 50);
        tree.insert("LX", 60);
        tree.insert("LXX", 70);
        tree.insert("LXXX", 80);
        tree.insert("XC", 90);

        tree.insert("C", 100);
        tree.insert("CC", 200);
        tree.insert("CCC", 300);
        tree.insert("CD", 400);
        tree.insert("D", 500);
        tree.insert("DC", 600);
        tree.insert("DCC", 700);
        tree.insert("DCCC", 800);
        tree.insert("CM", 900);

        tree.insert("M", 1000);
        tree.insert("MM", 2000);
        tree.insert("MMM", 3000);
    }

    public int romanToInt(String s) {
        return tree.find(s);
    }

}