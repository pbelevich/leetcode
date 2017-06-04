package com.leetcode.problems.peekingIterator;

import java.util.Iterator;

/**
 * https://leetcode.com/problems/peeking-iterator/#/description
 * <p>
 * 284. Peeking Iterator
 *
 * @author Pavel Belevich
 */
class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> iterator;
    private Integer temp;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public Integer peek() {
        if (temp != null) {
            return temp;
        } else if (iterator.hasNext()) {
            temp = iterator.next();
            return temp;
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public Integer next() {
        if (temp != null) {
            final Integer result = temp;
            temp = null;
            return result;
        } else if (iterator.hasNext()) {
            return iterator.next();
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public boolean hasNext() {
        return temp != null || iterator.hasNext();
    }

}
