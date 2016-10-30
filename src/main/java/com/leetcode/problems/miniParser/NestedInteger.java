package com.leetcode.problems.miniParser;

import java.util.ArrayList;
import java.util.List;

class NestedInteger {

    private int value;
    private final List<NestedInteger> list;

    // Constructor initializes an empty nested list.
    public NestedInteger() {
        this.value = 0;
        this.list = new ArrayList<>();
    }

    // Constructor initializes a single integer.
    public NestedInteger(int value) {
        this.value = value;
        this.list = null;
    }

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    boolean isInteger() {
        return this.list == null;
    }

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    Integer getInteger() {
        return this.value;
    }

    // Set this NestedInteger to hold a single integer.
    void setInteger(int value) {
        this.value = value;
    }

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    NestedInteger add(NestedInteger ni) {
        this.list.add(ni);
        return this;
    }

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    List<NestedInteger> getList() {
        return this.list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NestedInteger that = (NestedInteger) o;

        if (value != that.value) return false;
        return list != null ? list.equals(that.list) : that.list == null;

    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (list != null ? list.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NestedInteger{" +
                "value=" + value +
                ", list=" + list +
                '}';
    }
}
