package com.leetcode.problems.numberOfIslands;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void numIslands1() throws Exception {
        assertEquals(2, new Solution().numIslands(new char[][]{{'0', '1'}, {'1', '0'}}));
    }

    @Test
    public void numIslands2() throws Exception {
        assertEquals(3, new Solution().numIslands(new char[][]{
                "11000".toCharArray(),
                "11000".toCharArray(),
                "00100".toCharArray(),
                "00011".toCharArray(),
        }));
    }

    @Test
    public void numIslands3() throws Exception {
        assertEquals(1, new Solution().numIslands(new char[][]{
                "11110".toCharArray(),
                "11010".toCharArray(),
                "11000".toCharArray(),
                "00000".toCharArray(),
        }));
    }

    @Test
    public void numIslands4() throws Exception {
        assertEquals(0, new Solution().numIslands(new char[][]{
                "0".toCharArray(),
        }));
    }

    @Test
    public void numIslands5() throws Exception {
        assertEquals(1, new Solution().numIslands(new char[][]{
                "1".toCharArray(),
        }));
    }

    @Test
    public void numIslands6() throws Exception {
        assertEquals(0, new Solution().numIslands(new char[][]{}));
    }

    @Test
    public void numIslands7() throws Exception {
        assertEquals(3, new Solution().numIslands(new char[][]{"1011011".toCharArray()}));
    }

    @Test
    public void numIslands8() throws Exception {
        assertEquals(1, new Solution().numIslands(new char[][]{"0000001".toCharArray()}));
    }

}