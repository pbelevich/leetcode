package com.leetcode.problems.findMedianFromDataStream;

import java.util.Arrays;

public class MedianFinder {

    static class Heap {

        private int[] array;
        private int size;
        private boolean max;

        public Heap(int capacity) {
            this(capacity, false);
        }

        public Heap(int capacity, boolean max) {
            this.array = new int[capacity];
            this.max = max;
            this.size = 0;
        }

        public int size() {
            return this.size;
        }

        public boolean isEmpty() {
            return this.size == 0;
        }

        public void offer(int a) {
            resizeIfNeed();
            this.array[1 + size] = a;
            swim(1 + size);
            this.size++;
        }

        public int peek() {
            return this.array[1];
        }

        public int poll() {
            int a = this.array[1];
            swap(1, size);
            this.size--;
            sink(1);
            return a;
        }

        private void swap(int i, int j) {
            if (i != j) {
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }

        private void swim(int i) {
            while (i > 1 && greater(i >> 1, i)) {
                swap(i, i >> 1);
                i >>= 1;
            }
        }

        private boolean greater(int i, int j) {
            return max ? this.array[i] < this.array[j] : this.array[i] > this.array[j];
        }

        private void sink(int i) {
            while ((i << 1) <= size) {
                int j = i << 1;
                if (j < size && greater(j, j+1)) j++;
                if (!greater(i, j)) break;
                swap(i, j);
                i = j;
            }
        }

        private void resizeIfNeed() {
            if (array.length == size + 1) {
                array = Arrays.copyOf(array, array.length << 1);
            }
        }

    }

    private Heap maxHeap = new Heap(100, true);
    private Heap minHeap = new Heap(100);

    // Adds a number into the data structure.
    public void addNum(int num) {
        maxHeap.offer(num);
        minHeap.offer(maxHeap.poll());

        if(maxHeap.size() < minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }

    // Returns the median of current data stream
    public double findMedian() {
        if (maxHeap.isEmpty()) {
            throw new IllegalStateException();
        } else if (minHeap.size() == maxHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }

}