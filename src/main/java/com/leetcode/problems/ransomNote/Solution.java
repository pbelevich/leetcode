package com.leetcode.problems.ransomNote;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (isEmpty(ransomNote)) {
            return true;
        }
        if (isEmpty(magazine)) {
            return false;
        }
        char[] magazineChars = magazine.toCharArray();
        char min = Character.MAX_VALUE;
        char max = Character.MIN_VALUE;
        for (char c : magazineChars) {
            if (c < min) min = c;
            if (c > max) max = c;
        }
        int[] magazineMap = new int[max - min + 1];
        for (char c : magazineChars) {
            magazineMap[c - min]++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (c < min || c > max || magazineMap[c - min] == 0) {
                return false;
            }
            magazineMap[c - min]--;
        }
        return true;
    }

    private static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

}