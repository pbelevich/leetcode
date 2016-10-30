package com.leetcode.problems.twoSum.array;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assume.assumeThat;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void testTwoSum() {
        assumeThat(new Solution().twoSum(new int[] {2, 7, 11, 15}, 9), equalTo(new int[] {0, 1}));
        assumeThat(new Solution().twoSum(new int[] {-1,-2,-3,-4,-5}, -8), equalTo(new int[] {2, 4}));
    }

}