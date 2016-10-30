package com.leetcode.problems.insertDeleteGetrandomO1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomizedSetTest {

    @Test
    public void test() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertTrue(randomizedSet.insert(123));
        assertFalse(randomizedSet.insert(123));
        assertTrue(randomizedSet.insert(456));
        assertFalse(randomizedSet.insert(456));
        assertFalse(randomizedSet.remove(789));
        assertTrue(randomizedSet.remove(123));
    }

    @Test
    public void test2() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertTrue(randomizedSet.insert(1));
        assertFalse(randomizedSet.remove(2));
        assertTrue(randomizedSet.insert(2));
        randomizedSet.getRandom();
        assertTrue(randomizedSet.remove(1));
        assertFalse(randomizedSet.insert(2));
        randomizedSet.getRandom();
    }

}