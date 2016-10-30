package com.leetcode.problems.reverseWordsInAString;

public class Solution {

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int size = removeExtraSpaces(chars);
        boolean word = false;
        int start = -1, end;
        for (int i = 0; i <= size; i++) {
            if (i == size || chars[i] == ' ') {
                if (word) {
                    end = i;
                    reverse(chars, start, end);
                    word = false;
                }
            } else {
                if (!word) {
                    start = i;
                    word = true;
                }
            }
        }
        reverse(chars, 0, size);
        return new String(chars, 0, size);
    }

    private int removeExtraSpaces(char[] chars) {
        int i, j;
        for (i = 0, j = 0; i < chars.length; i++) {
            if (chars[i] == ' ' && (i == 0 || chars[i - 1] == ' ')) {
                continue;
            }
            chars[j++] = chars[i];
        }
        if (j >= 1 && chars[j - 1] == ' ') {
            j--;
        }
        return j;
    }

    static void reverse(char[] chars, int start, int end) {
        for (int i = 0; i < ((end - start) >> 1); i++) {
            char t = chars[start + i];
            chars[start + i] = chars[end - 1 - i];
            chars[end - 1 - i] = t;
        }
    }

}