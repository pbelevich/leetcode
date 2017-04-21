package com.leetcode.problems.rangeSumQuery2DMutable;

/**
 * https://leetcode.com/problems/range-sum-query-2d-mutable/#/description
 * <p>
 * 308. Range Sum Query 2D - Mutable
 *
 * @author Pavel Belevich
 */
public class NumMatrix {

    private int[][] nums;
    private int[][] tree;
    private int m;
    private int n;

    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        n = matrix.length;
        m = matrix[0].length;
        this.nums = new int[n][m];
        this.tree = new int[n + 1][m + 1];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                update(r, c, matrix[r][c]);
            }
        }
    }

    public void update(int row, int col, int val) {
        if (m == 0 || n == 0) return;
        int diff = val - nums[row][col];
        nums[row][col] = val;
        for (int r = row + 1; r <= n; r = next(r)) {
            for (int c = col + 1; c <= m; c = next(c)) {
                tree[r][c] += diff;
            }
        }
    }

    private int next(int index) {
        return index + (index & -index);
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum(row2 + 1, col2 + 1) - sum(row2 + 1, col1) - sum(row1, col2 + 1) + sum(row1, col1);
    }

    private int sum(int row, int col) {
        int sum = 0;
        for (int r = row; r > 0; r = parent(r)) {
            for (int c = col; c > 0; c = parent(c)) {
                sum += tree[r][c];
            }
        }
        return sum;
    }

    private int parent(int index) {
        return index - (index & -index);
    }

}
