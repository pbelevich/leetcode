package com.leetcode.problems.rangeSumQuery2DImmutable;

/**
 * https://leetcode.com/problems/range-sum-query-2d-immutable/#/description
 * <p>
 * 304. Range Sum Query 2D - Immutable
 *
 * @author Pavel Belevich
 */
public class NumMatrix {

    private int[][] sum;

    public NumMatrix(int[][] matrix) {
        final int n = matrix.length;
        final int m = n != 0 ? matrix[0].length : 0;
        sum = new int[n + 1][m + 1];
        for (int i = 1; i < sum.length; i++) {
            for (int j = 1; j < sum[0].length; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2 + 1][col2 + 1] - sum[row2 + 1][col1] - sum[row1][col2 + 1] + sum[row1][col1];
    }

}
