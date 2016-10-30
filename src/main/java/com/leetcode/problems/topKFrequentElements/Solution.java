package com.leetcode.problems.topKFrequentElements;

import java.util.*;

public class Solution {

    static class Element implements Comparable<Element> {

        int key;
        int count;

        Element(int key) {
            this(key, 0);
        }

        Element(int key, int count) {
            this.key = key;
            this.count = count;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Element element = (Element) o;

            return key == element.key && count == element.count;

        }

        @Override
        public int hashCode() {
            int result = key;
            result = 31 * result + count;
            return result;
        }

        @Override
        public int compareTo(Element that) {
            return Integer.compare(this.count, that.count);
        }

        @Override
        public String toString() {
            return "Element{" +
                    "key=" + key +
                    ", count=" + count +
                    '}';
        }

    }

    static List<Integer> topKFrequent(int[] nums, int k) {
        Element[] elements = toElements(nums);
        heapSort(elements);
        return getKLast(elements, k);
    }

    private static List<Integer> getKLast(Element[] elements, int k) {
        ArrayList<Integer> result = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            result.add(elements[elements.length - 1 - i].key);
        }
        return result;
    }

    private static <T extends Comparable<T>> void heapSort(T[] pq) {
        int n = pq.length;
        for (int k = (n >> 1); k >= 1; k--)
            sink(pq, k, n);
        while (n > 1) {
            exch(pq, 1, n--);
            sink(pq, 1, n);
        }
    }

    private static <T extends Comparable<T>> void sink(T[] pq, int k, int n) {
        while ((k << 1) <= n) {
            int j = k << 1;
            if (j < n && less(pq, j, j+1)) j++;
            if (!less(pq, k, j)) break;
            exch(pq, k, j);
            k = j;
        }
    }

    private static <T extends Comparable<T>> boolean less(T[] pq, int i, int j) {
        return pq[i-1].compareTo(pq[j-1]) < 0;
    }

    private static void exch(Object[] pq, int i, int j) {
        Object swap = pq[i-1];
        pq[i-1] = pq[j-1];
        pq[j-1] = swap;
    }

    private static Element[] toElements(int[] nums) {
        Map<Integer, Element> map = new HashMap<>();
        for (int n : nums) {
            Element element = map.get(n);
            if (element == null) {
                element = new Element(n);
                map.put(n, element);
            }
            element.count++;
        }
        Collection<Element> elements = map.values();
        return elements.toArray(new Element[elements.size()]);
    }

}