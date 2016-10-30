package com.leetcode.problems.medianOfTwoSortedArrays.bruteForce;

import com.leetcode.problems.medianOfTwoSortedArrays.AbstractSolutionTest;
import com.leetcode.problems.medianOfTwoSortedArrays.SolutionAdapter;

/**
 * @author Pavel Belevich
 */
public class SolutionTest extends AbstractSolutionTest {

    public SolutionTest() {
        super(new SolutionAdapter() {

            final Solution solution = new Solution();

            @Override
            public double findMedianSortedArrays(int[] nums1, int[] nums2) {
                return solution.findMedianSortedArrays(nums1, nums2);
            }
        });
    }

}