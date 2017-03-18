package com.leetcode.problems.implementStackUsingQueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class MyStackTest {

    @Test
    public void test() {
        MyStack stack = new MyStack();
        assertTrue(stack.empty());

        stack.push(1);
        assertFalse(stack.empty());
        assertEquals(1, stack.top());
        assertFalse(stack.empty());
        assertEquals(1, stack.pop());
        assertTrue(stack.empty());

        stack.push(2);
        assertFalse(stack.empty());
        assertEquals(2, stack.top());
        assertFalse(stack.empty());
        stack.push(3);
        assertFalse(stack.empty());
        assertEquals(3, stack.top());
        assertFalse(stack.empty());

        assertEquals(3, stack.pop());
        assertFalse(stack.empty());
        assertEquals(2, stack.top());
        assertFalse(stack.empty());
        assertEquals(2, stack.pop());
        assertTrue(stack.empty());
    }

}