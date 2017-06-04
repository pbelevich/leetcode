package com.leetcode.problems.peekingIterator;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class PeekingIteratorTest {

    @Test
    public void peek() throws Exception {
        final PeekingIterator it = new PeekingIterator(Arrays.asList(1, 2, 3).iterator());
        assertEquals(Integer.valueOf(1), it.next());
        assertEquals(Integer.valueOf(2), it.peek());
        assertEquals(Integer.valueOf(2), it.next());
        assertEquals(Integer.valueOf(3), it.next());
        assertFalse(it.hasNext());
    }

}
