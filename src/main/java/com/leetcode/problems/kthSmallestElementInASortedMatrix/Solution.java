package com.leetcode.problems.kthSmallestElementInASortedMatrix;

import java.util.Arrays;

public class Solution {

    public int kthSmallest(int[][] matrix, int k) {
        final int n = matrix.length;
        if (k <= (n << 1)) {
            int d = 0;
            for (int i = k; i != 1; i >>= 1, d++);
            int[] array = new int[d + 1];
            for (int i = 0; i < d + 1; i++) {
                array[i] = matrix[d - i][i];
            }
            Arrays.sort(array);
            return array[k - (1 << d)];
        } else {
            int d = 0;
            for (int i = n * n + 1 - k; i != 1; i >>= 1, d++);
            int[] array = new int[d + 1];
            for (int i = 0; i < d + 1; i++) {
                array[i] = matrix[n - 1 - (d - i)][n -1 - i];
            }
            Arrays.sort(array);
            return array[array.length - 1 - (n * n + 1 - k  - (1 << d))];
        }
    }

}