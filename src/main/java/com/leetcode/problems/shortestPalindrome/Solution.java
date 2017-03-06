package com.leetcode.problems.shortestPalindrome;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String shortestPalindrome(String s) {
        char input[] = s.toCharArray();

        char[] newInput = new char[(s.length() << 1) + 1];
        for (int i = 0; i < newInput.length; i++) {
            if ((i & 1) != 0) {
                newInput[i] = input[i >> 1];
            } else {
                newInput[i] = '$';
            }
        }

        int[] t = new int[newInput.length];
        int start = 0;
        int end = 0;

        for (int i = 0; i < newInput.length; ) {
            while (start > 0 && end < newInput.length - 1 && newInput[start - 1] == newInput[end + 1]) {
                start--;
                end++;
            }
            t[i] = end - start + 1;

            if (end == t.length - 1) {
                break;
            }

            int newCenter = end + ((i ^ 1) == 0 ? 1 : 1);

            for (int j = i + 1; j <= end; j++) {
                t[j] = Math.min(t[i - (j - i)], ((end - j) << 1) + 1);
                if (j + t[i - (j - i)] / 2 == end) {
                    newCenter = j;
                    break;
                }
            }

            i = newCenter;
            end = i + (t[i] >> 1);
            start = i - (t[i] >> 1);
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < t.length; i++) {
            int val = t[i];
            if (val > max && 0 == i - (val >> 1)) {
                max = val;
                maxIndex = i;
            }
        }

        int halfLength = max >> 2;
        if (newInput[maxIndex] == '$') {
            start = (maxIndex >> 1) - halfLength;
            end = (maxIndex >> 1) + halfLength - 1;
        } else {
            start = (maxIndex >> 1) - halfLength;
            end = (maxIndex >> 1) + halfLength;
        }

        int remaining = input.length - end - 1;

        char[] result = new char[(remaining << 1) + end - start + 1];

        for (int i = 0; i < remaining; i++) {
            result[i] = input[input.length - 1 - i];
        }

        for (int i = 0; i < input.length; i++) {
            result[remaining + i] = input[i];
        }

        return new String(result);
    }

}