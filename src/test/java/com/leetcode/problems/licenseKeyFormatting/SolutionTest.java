package com.leetcode.problems.licenseKeyFormatting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void licenseKeyFormatting() throws Exception {
        assertEquals("24A0-R74K", SOLUTION.licenseKeyFormatting("2-4A0r7-4k", 4));
        assertEquals("24-A0R-74K", SOLUTION.licenseKeyFormatting("2-4A0r7-4k", 3));
    }

}