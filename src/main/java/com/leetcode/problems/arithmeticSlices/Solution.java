package com.leetcode.problems.arithmeticSlices;

/**
 * https://leetcode.com/problems/arithmetic-slices/#/description
 * <p>
 * 413. Arithmetic Slices
 * <p>
 * A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.
 * <p>
 * For example, these are arithmetic sequence:
 * <p>
 * 1, 3, 5, 7, 9
 * 7, 7, 7, 7
 * 3, -1, -5, -9
 * The following sequence is not arithmetic.
 * <p>
 * 1, 1, 2, 5, 7
 * <p>
 * A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.
 * <p>
 * A slice (P, Q) of array A is called arithmetic if the sequence:
 * A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.
 * <p>
 * The function should return the number of arithmetic slices in the array A.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int numberOfArithmeticSlices(int[] a) {
        if (a.length < 3) {
            return 0;
        }
        int result = 0;
        int delta = a[1] - a[0];
        int counter = 2;
        for (int i = 2; i < a.length; i++) {
            if (a[i] - a[i - 1] != delta) {
                if (counter >= 3) {
                    result += f(counter);
                }
                counter = 2;
                delta = a[i] - a[i - 1];
            } else {
                counter++;
            }
        }
        if (counter >= 3) {
            result += f(counter);
        }
        return result;
    }

    private int f(int counter) {
        return (counter - 1) * (counter - 2) >> 1;
    }

}
