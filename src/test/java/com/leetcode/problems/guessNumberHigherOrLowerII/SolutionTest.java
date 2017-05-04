package com.leetcode.problems.guessNumberHigherOrLowerII;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    private static final Solution SOLUTION = new Solution();

    @Test
    public void getMoneyAmount1() throws Exception {
        assertEquals(0, SOLUTION.getMoneyAmount(1));
    }

    @Test
    public void getMoneyAmount2() throws Exception {
        assertEquals(1, SOLUTION.getMoneyAmount(2));
    }

    @Test
    public void getMoneyAmount3() throws Exception {
        assertEquals(2, SOLUTION.getMoneyAmount(3));
    }

    @Test
    public void getMoneyAmount4() throws Exception {
        assertEquals(4, SOLUTION.getMoneyAmount(4));
    }

    @Test
    public void getMoneyAmount5() throws Exception {
        assertEquals(6, SOLUTION.getMoneyAmount(5));
    }

    @Test
    public void getMoneyAmount6() throws Exception {
        assertEquals(8, SOLUTION.getMoneyAmount(6));
    }

    @Test
    public void getMoneyAmount10() throws Exception {
        assertEquals(16, SOLUTION.getMoneyAmount(10));
    }

//    @Ignore
    @Test
    public void getMoneyAmount20() throws Exception {
        assertEquals(49, SOLUTION.getMoneyAmount(20));
    }

}