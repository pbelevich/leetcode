package com.leetcode.problems.twoSum.map;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

import static org.junit.Assume.assumeThat;

public class SolutionTest {

    @Test
    public void testTwoSum() {
        assumeThat(new Solution().twoSum(new int[] {2, 7, 11, 15}, 9), equalTo(new int[] {0, 1}));
    }

}
