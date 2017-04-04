package com.leetcode.problems.longestPalindromicSubsequence;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void longestPalindromeSubseq() throws Exception {
        assertEquals(0, new Solution().longestPalindromeSubseq(""));
        assertEquals(1, new Solution().longestPalindromeSubseq("a"));
        assertEquals(1, new Solution().longestPalindromeSubseq("ab"));
        assertEquals(2, new Solution().longestPalindromeSubseq("aa"));
        assertEquals(3, new Solution().longestPalindromeSubseq("aba"));
        assertEquals(4, new Solution().longestPalindromeSubseq("abba"));
        assertEquals(5, new Solution().longestPalindromeSubseq("abcba"));
        assertEquals(5, new Solution().longestPalindromeSubseq("a11b3cba34"));
        assertEquals(1, new Solution().longestPalindromeSubseq("1a23"));
        assertEquals(4, new Solution().longestPalindromeSubseq("bbbab"));
        assertEquals(2, new Solution().longestPalindromeSubseq("cbbd"));
    }

}