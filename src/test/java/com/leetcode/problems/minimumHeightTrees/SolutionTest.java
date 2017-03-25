package com.leetcode.problems.minimumHeightTrees;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void findMinHeightTrees() throws Exception {
        assertEquals(Collections.singletonList(1), new Solution().findMinHeightTrees(4, new int[][]{{1, 0}, {1, 2}, {1, 3}}));
        assertEquals(Arrays.asList(3, 4), new Solution().findMinHeightTrees(6, new int[][]{{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}}));
    }

}