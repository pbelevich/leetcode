package com.leetcode.problems.fractionToRecurringDecimal;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    static class Fraction {

        final long numerator;
        final long denominator;

        Fraction(long numerator, long denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Fraction fraction = (Fraction) o;

            if (numerator != fraction.numerator) return false;
            return denominator == fraction.denominator;

        }

        @Override
        public int hashCode() {
            int result = (int) (numerator ^ (numerator >>> 32));
            result = 31 * result + (int) (denominator ^ (denominator >>> 32));
            return result;
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }

    }

    public String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb = new StringBuilder();

        boolean negative = numerator < 0 ^ denominator < 0;
        if (negative && numerator != 0) {
            sb.append("-");
        }

        long numeratorLong = Math.abs((long)numerator);
        long denominatorLong = Math.abs((long)denominator);

        sb.append(numeratorLong / denominatorLong);

        numeratorLong %= denominatorLong;

        if (numeratorLong > 0) {
            sb.append(".");
            int i = sb.length();
            Map<Fraction, Integer> cache = new HashMap<>();
            while (numeratorLong > 0) {
                Fraction fraction = new Fraction(numeratorLong, denominatorLong);
                Integer start = cache.get(fraction);
                if (start != null) {
                    sb.insert(start, "(");
                    sb.append(")");
                    break;
                }
                cache.put(fraction, i++);
                sb.append(numeratorLong * 10 / denominatorLong);
                numeratorLong = numeratorLong * 10 % denominatorLong;
            }
        }

        return sb.toString();
    }

}