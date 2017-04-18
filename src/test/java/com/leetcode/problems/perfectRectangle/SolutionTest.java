package com.leetcode.problems.perfectRectangle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void isRectangleCover1() throws Exception {
        assertTrue(new Solution().isRectangleCover(new int[][]{
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {3, 2, 4, 4},
                {1, 3, 2, 4},
                {2, 3, 3, 4}
        }));
    }

    @Test
    public void isRectangleCover2() throws Exception {
        assertFalse(new Solution().isRectangleCover(new int[][]{
                {1, 1, 2, 3},
                {1, 3, 2, 4},
                {3, 1, 4, 2},
                {3, 2, 4, 4}
        }));
    }

    @Test
    public void isRectangleCover3() throws Exception {
        assertFalse(new Solution().isRectangleCover(new int[][]{
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {1, 3, 2, 4},
                {3, 2, 4, 4}
        }));
    }

    @Test
    public void isRectangleCover4() throws Exception {
        assertFalse(new Solution().isRectangleCover(new int[][]{
                {1, 1, 3, 3},
                {3, 1, 4, 2},
                {1, 3, 2, 4},
                {2, 2, 4, 4}
        }));
    }

    @Test
    public void isRectangleCover5() throws Exception {
        assertFalse(new Solution().isRectangleCover(new int[][]{
                {0, 0, 1, 1},
                {0, 1, 3, 2},
                {1, 0, 2, 2}
        }));
    }

    @Test
    public void isRectangleCover6() throws Exception {
        assertFalse(new Solution().isRectangleCover(new int[][]{
                {0, 0, 1, 1},
                {0, 0, 2, 1},
                {1, 0, 2, 1},
                {0, 2, 2, 3},
        }));
    }

}