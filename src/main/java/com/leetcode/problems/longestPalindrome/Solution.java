package com.leetcode.problems.longestPalindrome;

/**
 * https://leetcode.com/problems/longest-palindrome/#/description
 * <p>
 * 409. Longest Palindrome
 * <p>
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * <p>
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * <p>
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * <p>
 * Example:
 * <p>
 * Input:
 * "abccccdd"
 * <p>
 * Output:
 * 7
 * <p>
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int longestPalindrome(String s) {
        int[] count = new int['z' - 'A' + 1];
        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }
        int result = 0;
        for (int i : count) {
            if ((i & 1) == 1) {
                result = 1;
                break;
            }
        }
        for (int i : count) {
            result += (i & ~1);
        }
        return result;
    }

}
