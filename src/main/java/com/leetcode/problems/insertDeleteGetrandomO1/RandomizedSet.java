package com.leetcode.problems.insertDeleteGetrandomO1;

public class RandomizedSet {

    private static final int DEFAULT_CAPACITY = 16;
    private static final double FACTOR = 0.75;

    private static class Bucket {

        private static class Node {
            int val;
            Node next;

            public Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }

        int size;
        Node node;

        public boolean insert(int val) {
            Node curr;
            for (curr = node; curr != null && curr.val != val; curr = curr.next);
            if (curr == null) {
                node = new Node(val, node);
                size++;
                return true;
            } else{
                return false;
            }
        }

        public boolean remove(int val) {
            if (node == null) {
                return false;
            } else if (node.val == val) {
                node = node.next;
                size--;
                return true;
            } else {
                Node prev;
                for (prev = node; prev.next != null && prev.next.val != val; prev = prev.next) ;
                if (prev.next != null) {
                    prev.next = prev.next.next;
                    size--;
                    return true;
                }
            }
            return false;
        }

        public int getRandom(int n) {
            Node curr = node;
            for (int i = 0; i < n; i++) {
                curr = curr.next;
            }
            return curr.val;
        }

    }

    private Bucket[] buckets;
    private int size;


    /** Initialize your data structure here. */
    public RandomizedSet() {
        buckets = new Bucket[DEFAULT_CAPACITY];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }
        size = 0;
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        resizeIfNeed();
        if (buckets[hash(val, this.buckets)].insert(val)) {
            size++;
            return true;
        } else {
            return false;
        }
    }

    private void resizeIfNeed() {
        if (size >= buckets.length * FACTOR) {
            Bucket[] newBuckets = new Bucket[buckets.length << 1];
            for (int i = 0; i < newBuckets.length; i++) {
                newBuckets[i] = new Bucket();
            }
            for (Bucket bucket : buckets) {
                for (Bucket.Node node = bucket.node; node != null; node = node.next) {
                    newBuckets[hash(node.val, newBuckets)].insert(node.val);
                }
            }
            buckets = newBuckets;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (buckets[hash(val, this.buckets)].remove(val)) {
            size--;
            return true;
        } else {
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int n = (int) (size * Math.random());
        int i;
        for (i = 0; n >= buckets[i].size; n -= buckets[i].size, i++);
        return buckets[i].getRandom(n);
    }

    private int hash(int val, Bucket[] buckets) {
        return val & (buckets.length - 1);
    }

}