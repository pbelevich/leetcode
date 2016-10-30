package com.leetcode.problems.stringToIntegerAtoi;

public class Solution {

    public int myAtoi(String str) {
        int result = 0;
        if (str != null && !str.isEmpty()) {
            char[] chars = str.toCharArray();
            boolean signInitilized = false;
            int sign = 1;
            int start = -1;
            int end = chars.length;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == ' ') {
                    if (start != -1) {
                        end = i;
                        break;
                    }
                    if (signInitilized) {
                        return 0;
                    }
                } else if (chars[i] == '+' && !signInitilized) {
                    signInitilized = true;
                } else  if (chars[i] == '-' && !signInitilized) {
                    signInitilized = true;
                    sign = -1;
                } else if (chars[i] >= '0' && chars[i] <= '9') {
                    if (start == -1) {
                        start = i;
                    }
                } else {
                    if (start != -1) {
                        end = i;
                        break;
                    } else {
                        return 0;
                    }
                }
            }
            long mult = 1;
            if (start == -1) {
                return 0;
            }
            long longResult = 0L;
            for (int i = end - 1; i >= start; i--) {
                longResult += (chars[i] - '0') * mult;
                mult *= 10;
                if (longResult >= -(long)Integer.MIN_VALUE) {
                    longResult = -(long)Integer.MIN_VALUE;
                    break;
                }
            }
            if (longResult * sign > Integer.MAX_VALUE) {
                longResult = Integer.MAX_VALUE;
            }
            result = (int) (longResult * sign);
        }
        return result;
    }

}