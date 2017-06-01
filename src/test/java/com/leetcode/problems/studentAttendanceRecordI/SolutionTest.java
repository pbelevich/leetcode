package com.leetcode.problems.studentAttendanceRecordI;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void checkRecord() throws Exception {
        assertTrue(SOLUTION.checkRecord("PPALLP"));
        assertFalse(SOLUTION.checkRecord("PPALLL"));
        assertFalse(SOLUTION.checkRecord("ALLAPPL"));
    }

}