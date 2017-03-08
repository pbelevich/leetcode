package com.leetcode.problems.copyListWithRandomPointer;

/**
 * @author Pavel Belevich
 */
public class RandomListNode {
    int label;
    RandomListNode next, random;

    RandomListNode(int x) {
        this.label = x;
    }

    RandomListNode(int label, RandomListNode next, RandomListNode random) {
        this.label = label;
        this.next = next;
        this.random = random;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RandomListNode that = (RandomListNode) o;

        if (label != that.label) return false;
        return next != null ? next.equals(that.next) : that.next == null;
    }

    @Override
    public int hashCode() {
        int result = label;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RandomListNode{" +
                "label=" + label +
                ", next=" + next +
                '}';
    }

}
