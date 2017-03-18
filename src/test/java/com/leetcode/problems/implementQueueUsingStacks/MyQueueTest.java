package com.leetcode.problems.implementQueueUsingStacks;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class MyQueueTest {

    @Test
    public void test() {
        MyQueue queue = new MyQueue();
        assertTrue(queue.empty());
        queue.push(1);
        assertFalse(queue.empty());
        assertEquals(1, queue.peek());
        assertFalse(queue.empty());
        assertEquals(1, queue.pop());
        assertTrue(queue.empty());

        queue.push(2);
        assertFalse(queue.empty());
        assertEquals(2, queue.peek());
        queue.push(3);
        assertFalse(queue.empty());
        assertEquals(2, queue.peek());
        assertFalse(queue.empty());
        assertEquals(2, queue.pop());
        assertFalse(queue.empty());
        assertEquals(3, queue.peek());
        assertFalse(queue.empty());
        assertEquals(3, queue.pop());
        assertTrue(queue.empty());
    }

}