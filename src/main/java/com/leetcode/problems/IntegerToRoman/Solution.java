package com.leetcode.problems.IntegerToRoman;

public class Solution {

    private static final String[] NUMERALS = {
            "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"
    };

    private static final String[] TENS = {
            "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"
    };

    private static final String[] HUNDREDS = {
            "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"
    };

    private static final String[] THOUSANDS = {
            "", "M", "MM", "MMM"
    };

    public String intToRoman(int num) {
        if (1 <= num && num <= 9) {
            return NUMERALS[num % 10];
        } else if (10 <= num && num <= 99) {
            return TENS[num / 10] + NUMERALS[num % 10];
        } else if (100 <= num && num <= 999) {
            return HUNDREDS[num / 100] + TENS[(num % 100) / 10] + NUMERALS[num % 10];
        } else if (1000 <= num && num <= 3999) {
            return THOUSANDS[num / 1000] + HUNDREDS[(num % 1000) / 100] + TENS[(num % 100) / 10] + NUMERALS[num % 10];
        } else {
            return null;
        }
    }

}