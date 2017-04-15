package com.leetcode.problems.rangeSumQuery2DMutable;

/**
 * https://leetcode.com/problems/range-sum-query-2d-mutable/#/description
 *
 * 308. Range Sum Query 2D - Mutable
 *
 * @author Pavel Belevich
 */
public class NumMatrix {

    public NumMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                update(r, c, matrix[r][c]);
            }
        }
    }

    public void update(int row, int col, int val) {

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum(row2, col2) - sum(row1, col2) - sum(row2, col1) + sum(row1, col1);
    }

    private int sum(int r, int c) {
        return 0;
    }

}
