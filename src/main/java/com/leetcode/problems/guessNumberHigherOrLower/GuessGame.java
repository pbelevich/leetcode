package com.leetcode.problems.guessNumberHigherOrLower;

/**
 * @author Pavel Belevich
 */
public class GuessGame {

    private int max;
    private int n;

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    int guess(int num) {
        if (num < n) {
            return 1;
        } else if (num > n) {
            return -1;
        } else {
            return 0;
        }
    }

}
