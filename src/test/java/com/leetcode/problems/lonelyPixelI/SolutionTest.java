package com.leetcode.problems.lonelyPixelI;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void findLonelyPixel1() throws Exception {
        assertEquals(3, SOLUTION.findLonelyPixel(new char[][]{
                {'W', 'W', 'B'},
                {'W', 'B', 'W'},
                {'B', 'W', 'W'},
        }));
    }

    @Test
    public void findLonelyPixel2() throws Exception {
        assertEquals(0, SOLUTION.findLonelyPixel(new char[][]{
                "BWWWWBWBBW".toCharArray(),
                "BBBWWWBWBW".toCharArray(),
                "BBBBWWWBWW".toCharArray(),
                "BWWBWBBWWW".toCharArray(),
                "WWBWBBBWBB".toCharArray(),
                "WBBWWWBWWW".toCharArray(),
                "BWWBBBWWWW".toCharArray(),
                "WWWBBBBWWW".toCharArray(),
                "WWBBWWWWBW".toCharArray(),
                "WWWBBBWWWB".toCharArray()
        }));
    }

}