package com.leetcode.problems.longestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        assertThat(new Solution().lengthOfLongestSubstring("abcabc"), equalTo(3));
        assertThat(new Solution().lengthOfLongestSubstring("bbbbb"), equalTo(1));
        assertThat(new Solution().lengthOfLongestSubstring("pwwkew"), equalTo(3));

        assertThat(new Solution().lengthOfLongestSubstring("tmmzuxt"), equalTo(5));
        assertThat(new Solution().lengthOfLongestSubstring("au"), equalTo(2));
    }

}