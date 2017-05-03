package com.leetcode.problems.findKPairsWithSmallestSums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * https://leetcode.com/problems/find-k-pairs-with-smallest-sums/#/description
 * <p>
 * 373. Find K Pairs with Smallest Sums
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<>(k);
        if (nums1.length != 0 && nums2.length != 0) {
            PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return Integer.compare(nums1[o1[0]] + nums2[o1[1]], nums1[o2[0]] + nums2[o2[1]]);
                }
            });
            queue.offer(new int[]{0, 0});
            Set<Long> set = new HashSet<>();
            for (int i = 0; i < k && !queue.isEmpty(); ) {
                int[] a = queue.poll();
                if (set.add(((long) a[0]) | ((long) a[1]) << Integer.SIZE)) {
                    result.add(new int[]{nums1[a[0]], nums2[a[1]]});
                    if (a[0] + 1 < nums1.length) queue.offer(new int[]{a[0] + 1, a[1]});
                    if (a[1] + 1 < nums2.length) queue.offer(new int[]{a[0], a[1] + 1});
                    i++;
                }
            }
        }
        return result;
    }

}
