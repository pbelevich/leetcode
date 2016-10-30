package com.leetcode.problems.validNumber;

public class Solution {

    public boolean isNumber(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        s = s.trim().toLowerCase();
        if (s.contains("f") || s.contains("d")) {
            return false;
        }
        try {
            Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}