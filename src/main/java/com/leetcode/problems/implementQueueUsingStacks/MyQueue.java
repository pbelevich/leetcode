package com.leetcode.problems.implementQueueUsingStacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/implement-queue-using-stacks/#/description
 * <p>
 * 232. Implement Queue using Stacks
 * <p>
 * Implement the following operations of a queue using stacks.
 * <p>
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * Notes:
 * You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
 * You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).
 *
 * @author Pavel Belevich
 */
public class MyQueue {

    private Deque<Integer> push;
    private Deque<Integer> pop;

    /** Initialize your data structure here. */
    public MyQueue() {
        push = new ArrayDeque<>();
        pop = new ArrayDeque<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        push.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (pop.isEmpty()) {
            while (!push.isEmpty()) {
                pop.push(push.pop());
            }
        }
        return pop.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (pop.isEmpty()) {
            while (!push.isEmpty()) {
                pop.push(push.pop());
            }
        }
        return pop.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return push.isEmpty() && pop.isEmpty();
    }

}
