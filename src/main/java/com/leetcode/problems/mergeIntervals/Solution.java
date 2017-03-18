package com.leetcode.problems.mergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-intervals/#/description
 * <p>
 * 56. Merge Intervals
 * <p>
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        List<Interval> result = new ArrayList<>();
        Collections.sort(intervals, (o1, o2) -> Integer.compare(o1.start, o2.start));

        Iterator<Interval> it = intervals.iterator();
        Interval curr = it.next();
        while (it.hasNext()) {
            Interval next = it.next();
            if (next.start <= curr.end) {
                curr.end = Math.max(next.end, curr.end);
            } else {
                result.add(curr);
                curr = next;
            }
        }
        result.add(curr);
        return result;
    }

}
