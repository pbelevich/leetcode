package com.leetcode.problems.lonelyPixelI;

/**
 * https://leetcode.com/problems/lonely-pixel-i/#/description
 * <p>
 * 531. Lonely Pixel I
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int findLonelyPixel(char[][] picture) {
        final int n = picture != null ? picture.length : 0;
        final int m = n != 0 ? picture[0].length : 0;

        final int[] rowCount = new int[n];
        final int[] colCount = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (picture[i][j] == 'B') {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (picture[i][j] == 'B' && rowCount[i] == 1 && colCount[j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

}
