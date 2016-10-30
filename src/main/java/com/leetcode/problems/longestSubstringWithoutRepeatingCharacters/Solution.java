package com.leetcode.problems.longestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        if (s.length() < 2) {
            return s.length();
        }
        Map<Character, Integer> map = new HashMap<>();
        int result = 1;
        for (int start = 0, end = 0; end < s.length(); end++) {
            char lastChar = s.charAt(end);
            Integer prev = map.get(lastChar);
            if (prev != null) {
                start = Math.max(prev + 1, start);
            }
            map.put(lastChar, end);
            int length = end - start + 1;
            result = Math.max(result, length);
        }
        return result;
    }

}