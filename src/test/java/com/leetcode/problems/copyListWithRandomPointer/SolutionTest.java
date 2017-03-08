package com.leetcode.problems.copyListWithRandomPointer;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 *
 * 138. Copy List with Random Pointer
 *
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
 *
 * Return a deep copy of the list.
 *
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
    }

}