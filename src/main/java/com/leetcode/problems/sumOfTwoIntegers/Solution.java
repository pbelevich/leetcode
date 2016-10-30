package com.leetcode.problems.sumOfTwoIntegers;

public class Solution {

    public int getSum(int a, int b) {
        int c = 0;
        int carry = 0;
        int i = 0;
        while (a != 0 || b != 0 || (carry != 0 && i < 32)) {
            int aBit = a & 1;
            int bBit = b & 1;
            int cBit = aBit ^ bBit ^ carry;
            carry = (aBit & bBit) | ((aBit ^ bBit) & carry);
            c |= (cBit << i++);
            a >>>= 1;
            b >>>= 1;
        }
        return c;
    }

}