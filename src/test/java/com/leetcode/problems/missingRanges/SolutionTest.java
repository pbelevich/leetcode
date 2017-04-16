package com.leetcode.problems.missingRanges;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void findMissingRanges() throws Exception {
        final List<String> missingRanges1 = SOLUTION.findMissingRanges(new int[]{50, 75}, 0, 99);
        final List<String> missingRanges2 = SOLUTION.findMissingRanges(new int[]{1, 3, 50, 75}, 0, 99);
        final List<String> missingRanges3 = SOLUTION.findMissingRanges(new int[]{0, 1, 3, 50, 75}, 0, 99);
        final List<String> missingRanges4 = SOLUTION.findMissingRanges(new int[]{1, 1, 1}, 1, 1);
        final List<String> missingRanges5 = SOLUTION.findMissingRanges(new int[]{-2147483648, 2147483647}, -2147483648, 2147483647);
    }

}