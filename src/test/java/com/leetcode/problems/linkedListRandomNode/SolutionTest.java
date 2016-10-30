package com.leetcode.problems.linkedListRandomNode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void getRandom() throws Exception {
        System.out.println(new Solution(new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))))).getRandom());
    }

}