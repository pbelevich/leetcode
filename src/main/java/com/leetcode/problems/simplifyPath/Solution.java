package com.leetcode.problems.simplifyPath;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String simplifyPath(String path) {
        char[] chars = path.toCharArray();

        int[] stack = new int[chars.length << 1];
        int top = 0;

        int resultStringLength = 0;
        for (int begin = 1, end = 1; end <= chars.length; end++) {
            if (end == chars.length || chars[end] == '/') {
                if (begin + 2 == end && chars[begin] == '.') {
                    if (top > 0) {
                        int strLength = stack[top - 1];
                        top -= 2;
                        resultStringLength -= 1 + strLength;
                    }
                } else if (begin != end && (begin + 1 != end || chars[begin] != '.')) {
                    stack[top] = begin;
                    int strLength = end - begin;
                    stack[top + 1] = strLength;
                    top += 2;
                    resultStringLength += 1 + strLength;
                }
                begin = end + 1;
            }
        }
        resultStringLength = Math.max(1, resultStringLength);
        char[] newChars = new char[resultStringLength];
        newChars[0] = '/';
        int i = 0;

        for (int k = 0; k < top; k += 2) {
            newChars[i++] = '/';
            int strBegin = stack[k];
            int strLength = stack[k + 1];
            System.arraycopy(chars, strBegin, newChars, i, strLength);
            i += strLength;
        }

        return new String(newChars);
    }

}