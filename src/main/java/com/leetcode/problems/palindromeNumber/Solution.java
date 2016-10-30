package com.leetcode.problems.palindromeNumber;

public class Solution {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x;
        int z = 1;
        while (y >= 10) {
            y /= 10;
            z *= 10;
        }

        for (int i = 1, j = z; j / i >= 10; i *= 10, j /= 10) {
            int digit1 = (x / i) % 10;
            int digit2 = (x / j) % 10;
            if (digit1 != digit2) {
                return false;
            }
        }
        return true;
    }

}