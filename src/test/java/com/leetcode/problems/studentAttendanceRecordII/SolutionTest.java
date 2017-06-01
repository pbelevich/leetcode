package com.leetcode.problems.studentAttendanceRecordII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void checkRecord() throws Exception {
        assertEquals(8, SOLUTION.checkRecord(2));
        assertEquals(43, SOLUTION.checkRecord(4));
        assertEquals(985598218, SOLUTION.checkRecord(100));
    }

}