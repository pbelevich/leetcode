package com.leetcode.problems.countPrimes;

/**
 * https://leetcode.com/problems/count-primes/#/description
 *
 * 204. Count Primes
 *
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int countPrimes(int n) {
        boolean[] numbers = new boolean[n];

        int result = 0;
        for (int i = 2; i < n; i++) {
            if (!numbers[i]) {
                result++;
                for (int j = i + i; j < n; j += i) {
                    numbers[j] = true;
                }
            }
        }
        return result;
    }

}
