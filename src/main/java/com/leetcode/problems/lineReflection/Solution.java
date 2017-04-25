package com.leetcode.problems.lineReflection;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/line-reflection/#/description
 * <p>
 * 356. Line Reflection
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isReflected(int[][] points) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Long> set = new HashSet<>();
        for (int[] p : points) {
            int x = p[0];
            int y = p[1];
            min = Math.min(min, x);
            max = Math.max(max, x);
            set.add(p(x, y));
        }
        int minPlusMax = min + max;

        for (int[] p : points) {
            int x = p[0];
            int y = p[1];
            long opposite = p(minPlusMax - x, y);
            if (!set.contains(opposite)) {
                return false;
            }
        }

        return true;
    }

    private long p(int x, int y) {
        return (((long) x) & 0xFFFFFFFFL) | (((long) y) << Integer.SIZE);
    }

}
