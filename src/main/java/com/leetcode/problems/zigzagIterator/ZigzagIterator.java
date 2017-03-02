package com.leetcode.problems.zigzagIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Pavel Belevich
 */
public class ZigzagIterator implements Iterator {

    private final List<Iterator<Integer>> iterators = new ArrayList<>(2);
    private int current = 0;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        if (v1 != null) iterators.add(v1.iterator());
        if (v2 != null) iterators.add(v2.iterator());
    }

    @Override
    public boolean hasNext() {
        if (iterators.isEmpty()) {
            return false;
        }
        Iterator<Integer> current = iterators.get(this.current);
        if (!current.hasNext()) {
            iterators.remove(this.current);
            if (iterators.isEmpty()) {
                return false;
            }
            this.current = (this.current + 1) % iterators.size();
            return hasNext();
        }
        return true;
    }

    @Override
    public Object next() {
        if (iterators.isEmpty()) {
            throw new NoSuchElementException();
        }
        if (this.current >= iterators.size()) {
            throw new NoSuchElementException();
        }
        Iterator<Integer> current = iterators.get(this.current);
        if (current == null || !current.hasNext()) {
            throw new NoSuchElementException();
        }
        this.current = (this.current + 1) % iterators.size();
        return current.next();
    }

}
