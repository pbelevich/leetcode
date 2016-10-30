package com.leetcode.problems.removeInvalidParentheses;

import java.util.*;

public class Solution {

    static void removeInvalidParentheses(char[] chars, int i, int state, Set<String> result) {
        if (i == chars.length) {
            if (state == 0) {
                result.add(new String(chars));
            } else {
                int k = zeroStateIndex(chars, state);
                for (int j = k; j < chars.length; j += repeats(chars, j)) {
                    if (chars[j] == '(') {
                        removeInvalidParentheses(removeChar(chars, j), i - 1, state - 1, result);
                    }
                }
            }
        } else {
            if (state == 0) {
                if (chars[i] == ')') {
                    for (int j = 0; j <= i; j += repeats(chars, j)) {
                        if (chars[j] == ')') {
                            removeInvalidParentheses(removeChar(chars, j), i, state, result);
                        }
                    }
                } else {
                    int repeats = repeats(chars, i);
                    removeInvalidParentheses(chars, i + repeats, state + repeats * toState(chars[i]), result);
                }
            } else {
                removeInvalidParentheses(chars, i + 1, state + toState(chars[i]), result);
            }
        }
    }

    private static int repeats(char[] chars, int i) {
        int result = 0;
        for (int j = i; j < chars.length && chars[j] == chars[i]; j++) {
            result++;
        }
        return result;
    }

    static int zeroStateIndex(char[] chars, int state) {
        for (int i = chars.length - 1; i >= 0; i--) {
            state -= toState(chars[i]);
            if (state == 0) {
                return i;
            }
        }
        throw new RuntimeException();
    }

    static char[] removeChar(char[] chars, int j) {
        char[] result = new char[chars.length - 1];
        System.arraycopy(chars, 0, result, 0, j);
        System.arraycopy(chars, j + 1, result, j, chars.length - j - 1);
        return result;
    }

    static int toState(char c) {
        switch (c) {
            case '(':
                return 1;
            case ')':
                return -1;
            default:
                return 0;
        }
    }

    public List<String> removeInvalidParentheses(String s) {
        Set<String> result = new HashSet<>();
        Solution.removeInvalidParentheses(s.toCharArray(), 0, 0, result);
        return new ArrayList<>(result);
    }

}