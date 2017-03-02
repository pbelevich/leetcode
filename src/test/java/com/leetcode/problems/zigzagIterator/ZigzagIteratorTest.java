package com.leetcode.problems.zigzagIterator;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class ZigzagIteratorTest {

    @Test
    public void nextNullsHasNext() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(null, null);
        assertFalse(zigzagIterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void nextNullsNext() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(null, null);
        zigzagIterator.next();
    }

    @Test
    public void nextEmptiesHasNext() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Collections.emptyList(), Collections.emptyList());
        assertFalse(zigzagIterator.hasNext());
    }

    @Test(expected = NoSuchElementException.class)
    public void nextEmptiesNext() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Collections.emptyList(), Collections.emptyList());
        zigzagIterator.next();
    }

    @Test
    public void nextFirstNonEmpty() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Arrays.asList(1, 2, 3), Collections.emptyList());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(1, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(2, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(3, zigzagIterator.next());
        assertFalse(zigzagIterator.hasNext());
    }

    @Test
    public void nextSecondNonEmpty() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Collections.emptyList(), Arrays.asList(1, 2, 3));
        assertTrue(zigzagIterator.hasNext());
        assertEquals(1, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(2, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(3, zigzagIterator.next());
        assertFalse(zigzagIterator.hasNext());
    }

    @Test
    public void nextBothNonEmptySameSize() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        assertTrue(zigzagIterator.hasNext());
        assertEquals(1, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(4, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(2, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(5, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(3, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(6, zigzagIterator.next());
        assertFalse(zigzagIterator.hasNext());
    }

    @Test
    public void nextBothNonEmptyDifferentSizes1() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Arrays.asList(1, 2, 3), Collections.singletonList(4));
        assertTrue(zigzagIterator.hasNext());
        assertEquals(1, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(4, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(2, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(3, zigzagIterator.next());
        assertFalse(zigzagIterator.hasNext());
    }

    @Test
    public void nextBothNonEmptyDifferentSizes2() throws Exception {
        ZigzagIterator zigzagIterator = new ZigzagIterator(Arrays.asList(1, 2), Arrays.asList(4, 5, 6));
        assertTrue(zigzagIterator.hasNext());
        assertEquals(1, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(4, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(2, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(5, zigzagIterator.next());
        assertTrue(zigzagIterator.hasNext());
        assertEquals(6, zigzagIterator.next());
        assertFalse(zigzagIterator.hasNext());
    }

}