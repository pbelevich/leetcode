package com.leetcode.problems.rotateImage;

/**
 * https://leetcode.com/problems/rotate-image/#/description
 * <p>
 * 48. Rotate Image
 * <p>
 * You are given an n x n 2D matrix representing an image.
 * <p>
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * Follow up:
 * Could you do this in-place?
 *
 * @author Pavel Belevich
 */
public class Solution {

    public void rotate(int[][] matrix) {
        final int N = matrix.length;
        for (int i = 0; i < (N >> 1); i++) {
            int j = N - 1 - i;
            int[] temp = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = temp;
        }
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

}
