package com.leetcode.problems.addBinary;

/**
 * https://leetcode.com/problems/add-binary/#/description
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 *
 * @author Pavel Belevich
 */
public class Solution {

    public String addBinary(String a, String b) {
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();
        char[] C = new char[Math.max(A.length, B.length) + 1];
        int carry = 0;
        for (int i = A.length - 1, j = B.length - 1, k = C.length - 1; k >= 0; i--, j--, k--) {
            int x = i >= 0 ? A[i] - '0' : 0;
            int y = j >= 0 ? B[j] - '0' : 0;
            int sum = x + y + carry;
            C[k] = (char) ((sum & 1) + '0');
            carry = sum >> 1;
        }
        int offset = (C[0] + 1) & 1;
        int count = C.length - offset;
        return new String(C, offset, count);
    }

}
