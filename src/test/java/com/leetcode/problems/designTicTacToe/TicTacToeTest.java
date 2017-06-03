package com.leetcode.problems.designTicTacToe;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class TicTacToeTest {

    @Test
    public void move() throws Exception {
        TicTacToe toe = new TicTacToe(3);
        assertEquals(0, toe.move(0, 0, 1));
        assertEquals(0, toe.move(0, 2, 2));
        assertEquals(0, toe.move(2, 2, 1));
        assertEquals(0, toe.move(1, 1, 2));
        assertEquals(0, toe.move(2, 0, 1));
        assertEquals(0, toe.move(1, 0, 2));
        assertEquals(1, toe.move(2, 1, 1));
    }

}