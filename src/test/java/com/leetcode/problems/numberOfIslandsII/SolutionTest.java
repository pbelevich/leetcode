package com.leetcode.problems.numberOfIslandsII;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void numIslands2() throws Exception {
        final List<Integer> actual = new Solution().numIslands2(3, 3, new int[][]{{0, 0}, {0, 1}, {1, 2}, {2, 1}});
    }

}