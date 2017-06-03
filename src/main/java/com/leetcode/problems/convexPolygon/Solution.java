package com.leetcode.problems.convexPolygon;

import java.util.Iterator;
import java.util.List;

/**
 * https://leetcode.com/problems/convex-polygon/#/description
 * <p>
 * 469. Convex Polygon
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean isConvex(List<List<Integer>> points) {
        if (points.size() < 2) {
            return false;
        }
        if (points.size() == 3) {
            return true;
        }
        Integer prevCrossProduct = null;
        int crossProduct;
        Iterator<List<Integer>> it = points.iterator();
        List<Integer> prev, curr, next;
        for (prev = it.next(), curr = it.next(), next = it.next(); ; prev = curr, curr = next, next = it.next()) {
            crossProduct = crossProduct(prev, curr, next);
            if (prevCrossProduct != null) {
                if ((crossProduct < 0 && prevCrossProduct > 0) || (crossProduct > 0 && prevCrossProduct < 0)) {
                    return false;
                }
            }
            if (crossProduct != 0) {
                prevCrossProduct = crossProduct;
            }
            if (!it.hasNext()) {
                break;
            }
        }

        it = points.iterator();
        prev = curr;
        curr = next;
        next = it.next();
        crossProduct = crossProduct(prev, curr, next);
        if ((crossProduct < 0 && prevCrossProduct > 0) || (crossProduct > 0 && prevCrossProduct < 0)) {
            return false;
        }
        if (crossProduct != 0) {
            prevCrossProduct = crossProduct;
        }

        prev = curr;
        curr = next;
        next = it.next();

        crossProduct = crossProduct(prev, curr, next);
        if ((crossProduct < 0 && prevCrossProduct > 0) || (crossProduct > 0 && prevCrossProduct < 0)) {
            return false;
        }

        return true;
    }

    private int crossProduct(List<Integer> a, List<Integer> b, List<Integer> c) {
        return crossProduct(a.get(0), a.get(1), b.get(0), b.get(1), c.get(0), c.get(1));
    }

    private int crossProduct(int ax, int ay, int bx, int by, int cx, int cy) {
        int bax = ax - bx;
        int bay = ay - by;
        int bcx = cx - bx;
        int bcy = cy - by;
        return (bax * bcy - bay * bcx);
    }

}
