package com.leetcode.problems.minStack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/min-stack/#/description
 * <p>
 * 155. Min Stack
 *
 * @author Pavel Belevich
 */
public class MinStack {

    private int min = Integer.MAX_VALUE;
    private Deque<int[]> stack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new ArrayDeque<>();
    }

    public void push(int x) {
        min = Math.min(min, x);
        stack.push(new int[]{x, min});
    }

    public void pop() {
        stack.pop();
        int[] peek = stack.peek();
        min = peek != null ? peek[1] : Integer.MAX_VALUE;
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }

}
