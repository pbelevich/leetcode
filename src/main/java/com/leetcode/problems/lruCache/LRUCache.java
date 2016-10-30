package com.leetcode.problems.lruCache;

public class LRUCache {

    private static final int DEFAULT_CAPACITY = 1024;

    private static class Node {

        int key;
        int value;
        Node adj;
        Node next;
        Node prev;

        public Node() {
        }

        Node(int key, int value, Node adj) {
            this.key = key;
            this.value = value;
            this.adj = adj;
        }

    }

    private Node[] buckets;
    private final Node head;
    private final Node tail;
    private int size;
    private final int capacity;

    public LRUCache(int capacity) {
        assert capacity >= 0;
        this.capacity = capacity;
        this.buckets = new Node[DEFAULT_CAPACITY];
        this.size = 0;
        this.head = new Node();
        this.tail = new Node();
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        Node node;
        int hash = hash(key, this.buckets);
        for (node = this.buckets[hash]; node != null && node.key != key; node = node.adj);
        if (node == null) {
            return -1;
        } else {
            swim(node);
            return node.value;
        }
    }

    public void set(int key, int value) {
        resizeIfNeed();
        Node node;
        int hash = hash(key, this.buckets);
        for (node = this.buckets[hash]; node != null && node.key != key; node = node.adj);
        if (node == null) {
            node = this.buckets[hash] = new Node(key, value, this.buckets[hash]);
            size++;
            head.next.prev = node;
            node.next = head.next;
            node.prev = head;
            head.next = node;
            if (size > capacity) {
                int hashPrev = hash(tail.prev.key, this.buckets);
                Node tailBucket = this.buckets[hashPrev];
                if (tailBucket == tail.prev) {
                    this.buckets[hashPrev] = tail.prev.adj;
                } else {
                    Node prevToTail;
                    for (prevToTail = tailBucket; prevToTail.adj != null && prevToTail.adj != tail.prev; prevToTail = prevToTail.adj);
                    prevToTail.adj = prevToTail.adj.adj;
                }
                tail.prev.prev.next = tail;
                tail.prev = tail.prev.prev;
            }
        } else {
            swim(node);
            node.value = value;
        }
    }

    private void swim(Node node) {
        if (node != tail.next) {
            Node prev = node.prev;
            Node next = node.next;
            prev.next = next;
            next.prev = prev;
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }
    }

    private void resizeIfNeed() {
        // TODO
    }

    private static int hash(int key, Node[] buckets) {
        return key & (buckets.length - 1);
    }

}