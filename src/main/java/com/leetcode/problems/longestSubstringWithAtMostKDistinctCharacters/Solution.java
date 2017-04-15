package com.leetcode.problems.longestSubstringWithAtMostKDistinctCharacters;

/**
 * https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/#/description
 * <p>
 * 340. Longest Substring with At Most K Distinct Characters
 * <p>
 * Given a string, find the length of the longest substring T that contains at most k distinct characters.
 * <p>
 * For example, Given s = “eceba” and k = 2,
 * <p>
 * T is "ece" which its length is 3.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        final char[] chars = s.toCharArray();
        int longest = 0;
        int curr = 0;
        int[] count = new int[256];
        for (int start = 0, end = 0; end < s.length(); end++) {
            if (count[chars[end]]++ == 0) {
                curr++;
            }
            while (curr > k) {
                if (--count[chars[start++]] == 0) {
                    curr--;
                }
            }
            longest = Math.max(longest, end - start + 1);
        }
        return longest;
    }

}
