package com.leetcode.problems.implementStackUsingQueues;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/implement-stack-using-queues/#/description
 * <p>
 * 225. Implement Stack using Queues
 * <p>
 * Implement the following operations of a stack using queues.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * empty() -- Return whether the stack is empty.
 * Notes:
 * You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
 * Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
 * You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).
 *
 * @author Pavel Belevich
 */
public class MyStack {

    private Deque<Integer>[] queues;
    private int active;
    private Integer top;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        queues = new Deque[2];
        queues[0] = new ArrayDeque<>();
        queues[1] = new ArrayDeque<>();
        active = 0;
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queues[active].offer(x);
        top = x;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        int inactive = (active + 1) & 1;
        Integer x = null;
        while (!queues[active].isEmpty()) {
            x = queues[active].poll();
            if (!queues[active].isEmpty()) {
                queues[inactive].offer(x);
                top = x;
            }
        }
        active = inactive;
        return x;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return top;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queues[active].isEmpty();
    }

}
