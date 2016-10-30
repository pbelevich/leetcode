package com.leetcode.problems.validParentheses;

public class Solution {

    private static class Stack {

        private char[] chars;
        private int top;

        Stack(int size) {
            this.chars = new char[size];
            this.top = 0;
        }

        void push(char c) {
            this.chars[this.top++] = c;
        }

        char pop() {
            return this.chars[--this.top];
        }

        public boolean isEmpty() {
            return top == 0;
        }

    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack stack = new Stack(s.length());
        for (char c : chars) {
            if (isOpen(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != reverse(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpen(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private char reverse(char c) {
        switch (c) {
            case ')': return '(';
            case ']': return '[';
            case '}': return '{';
            default: throw new RuntimeException();
        }
    }

}