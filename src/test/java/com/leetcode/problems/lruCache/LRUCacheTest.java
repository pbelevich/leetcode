package com.leetcode.problems.lruCache;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class LRUCacheTest {

    @Test
    public void test0() {
        LRUCache lruCache = new LRUCache(0);
        assertEquals(-1, lruCache.get(0));
        assertEquals(-1, lruCache.get(100));
        assertEquals(-1, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(0, 1000);
        assertEquals(-1, lruCache.get(0));
        assertEquals(-1, lruCache.get(100));
        assertEquals(-1, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(100, 1100);
        assertEquals(-1, lruCache.get(0));
        assertEquals(-1, lruCache.get(100));
        assertEquals(-1, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(200, 2100);
        assertEquals(-1, lruCache.get(0));
        assertEquals(-1, lruCache.get(100));
        assertEquals(-1, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(300, 3100);
        assertEquals(-1, lruCache.get(0));
        assertEquals(-1, lruCache.get(100));
        assertEquals(-1, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(400, 4100);
        assertEquals(-1, lruCache.get(0));
        assertEquals(-1, lruCache.get(100));
        assertEquals(-1, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));
    }

    @Test
    public void test() {
        LRUCache lruCache = new LRUCache(3);
        assertEquals(-1, lruCache.get(0));
        assertEquals(-1, lruCache.get(100));
        assertEquals(-1, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(0, 1000);
        assertEquals(1000, lruCache.get(0));
        assertEquals(-1, lruCache.get(100));
        assertEquals(-1, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(100, 1100);
        assertEquals(1000, lruCache.get(0));
        assertEquals(1100, lruCache.get(100));
        assertEquals(-1, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(200, 2100);
        assertEquals(1000, lruCache.get(0));
        assertEquals(1100, lruCache.get(100));
        assertEquals(2100, lruCache.get(200));
        assertEquals(-1, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(300, 3100);
        assertEquals(-1, lruCache.get(0));
        assertEquals(1100, lruCache.get(100));
        assertEquals(2100, lruCache.get(200));
        assertEquals(3100, lruCache.get(300));
        assertEquals(-1, lruCache.get(400));

        lruCache.set(400, 4100);
        assertEquals(-1, lruCache.get(0));
        assertEquals(-1, lruCache.get(100));
        assertEquals(2100, lruCache.get(200));
        assertEquals(3100, lruCache.get(300));
        assertEquals(4100, lruCache.get(400));
    }

    @Test
    public void test1() {
        LRUCache lruCache = new LRUCache(3);
        lruCache.set(1, 1);
        lruCache.set(2, 2);
        lruCache.set(3, 3);
        lruCache.set(4, 4);
        lruCache.get(4);
        lruCache.get(3);
        lruCache.get(2);
        lruCache.get(1);
        lruCache.set(5, 5);
        lruCache.get(1);
        lruCache.get(2);
        lruCache.get(3);
        lruCache.get(4);
        lruCache.get(5);
    }

    @Test
    public void test2() {
        LRUCache lruCache = new LRUCache(3);
        lruCache.set(0, 0);
        lruCache.set(1, 1);
        lruCache.set(16, 16);
        assertEquals(16, lruCache.get(16));
        assertEquals(1, lruCache.get(1));
        assertEquals(0, lruCache.get(0));
        lruCache.set(32, 32);
        assertEquals(32, lruCache.get(32));
        assertEquals(-1, lruCache.get(16));
        assertEquals(1, lruCache.get(1));
        assertEquals(0, lruCache.get(0));
    }

}