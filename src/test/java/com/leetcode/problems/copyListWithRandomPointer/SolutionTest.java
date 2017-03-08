package com.leetcode.problems.copyListWithRandomPointer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void copyRandomList() throws Exception {
        assertEquals(null, SOLUTION.copyRandomList(null));
        assertEquals(new RandomListNode(42), SOLUTION.copyRandomList(new RandomListNode(42)));

        RandomListNode original = new RandomListNode(42);
        original.random = original;
        RandomListNode copy = new RandomListNode(42);
        copy.random = copy;
        assertEquals(copy, SOLUTION.copyRandomList(original));

        original = new RandomListNode(1, new RandomListNode(2, new RandomListNode(3)));
        original.random = original.next;
        original.next.random = original.next;
        original.next.next.random = original.next;
        copy = new RandomListNode(1, new RandomListNode(2, new RandomListNode(3)));
        copy.random = copy.next;
        copy.next.random = copy.next;
        copy.next.next.random = copy.next;
        assertEquals(copy, SOLUTION.copyRandomList(original));
    }

}