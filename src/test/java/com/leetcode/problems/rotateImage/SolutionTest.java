package com.leetcode.problems.rotateImage;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void rotate() throws Exception {
        int[][] actual = {};
        SOLUTION.rotate(actual);
        assertThat(actual, is(new int[][]{}));

        actual = new int[][]{{1}};
        SOLUTION.rotate(actual);
        assertThat(actual, is(new int[][]{{1}}));

        actual = new int[][]{{1, 2}, {3, 4}};
        SOLUTION.rotate(actual);
        assertThat(actual, is(new int[][]{{3, 1}, {4, 2}}));

        actual = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        SOLUTION.rotate(actual);
        assertThat(actual, is(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}));
    }

}