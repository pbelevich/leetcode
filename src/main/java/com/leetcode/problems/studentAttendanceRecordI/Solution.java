package com.leetcode.problems.studentAttendanceRecordI;

/**
 * 551. Student Attendance Record I
 *
 * @author Pavel Belevich
 */
public class Solution {

    public boolean checkRecord(String s) {
        final char[] chars = s.toCharArray();
        int aCount = 0;
        for (int i = 0; i < chars.length; ) {
            final char c = chars[i];
            int len = 1;
            if (c == 'A') {
                aCount++;
                if (aCount > 1) {
                    return false;
                }
            } else if (c == 'L') {
                len = len(chars, i);
                if (len > 2) {
                    return false;
                }
            }
            i += len;
        }
        return true;
    }

    int len(char[] chars, int i) {
        int result = 1;
        for (int j = i + 1; j < chars.length && chars[j] == chars[i]; j++) {
            result++;
        }
        return result;
    }

}
