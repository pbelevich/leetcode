package com.leetcode.problems.perfectRectangle;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/perfect-rectangle/#/solutions
 * <p>
 * 391. Perfect Rectangle
 * <p>
 * Given N axis-aligned rectangles where N > 0, determine if they all together form an exact cover of a rectangular region.
 * <p>
 * Each rectangle is represented as a bottom-left point and a top-right point. For example, a unit square is represented as [1,1,2,2]. (coordinate of bottom-left point is (1, 1) and top-right point is (2, 2)).
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isRectangleCover(int[][] rectangles) {
        if (rectangles.length == 0 || rectangles[0].length == 0) return false;

        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y1 = Integer.MAX_VALUE;
        int y2 = Integer.MIN_VALUE;

        Set<Long> set = new HashSet<>();
        int area = 0;

        for (int[] rect : rectangles) {
            x1 = Math.min(rect[0], x1);
            y1 = Math.min(rect[1], y1);
            x2 = Math.max(rect[2], x2);
            y2 = Math.max(rect[3], y2);

            area += (rect[2] - rect[0]) * (rect[3] - rect[1]);

            Long s1 = p(rect[0], rect[1]);
            Long s2 = p(rect[0], rect[3]);
            Long s3 = p(rect[2], rect[3]);
            Long s4 = p(rect[2], rect[1]);

            if (!set.add(s1)) set.remove(s1);
            if (!set.add(s2)) set.remove(s2);
            if (!set.add(s3)) set.remove(s3);
            if (!set.add(s4)) set.remove(s4);
        }

        return area == (x2 - x1) * (y2 - y1) && set.size() == 4 &&
                set.contains(p(x1, y1)) && set.contains(p(x1, y2)) &&
                set.contains(p(x2, y1)) && set.contains(p(x2, y2));
    }

    static long p(int x, int y) {
        return (((long) x) & 0xffffffffL) | (((long) y) << 32);
    }

}
