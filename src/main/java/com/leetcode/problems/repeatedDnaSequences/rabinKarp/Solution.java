package com.leetcode.problems.repeatedDnaSequences.rabinKarp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    static int hash(char c) {
        switch (c) {
            case 'A': return 0;
            case 'C': return 1;
            case 'G': return 2;
            case 'T': return 3;
            default: throw new IllegalArgumentException();
        }
    }

    static char decode(int hash) {
        switch (hash) {
            case 0: return 'A';
            case 1: return 'C';
            case 2: return 'G';
            case 3: return 'T';
            default: throw new IllegalArgumentException();
        }
    }

    static int hash(char[] chars, int start, int end) {
        int result = 0;
        for (int i = end - 1; i >= start; i--) {
            result <<= 2;
            result |= hash(chars[i]);
        }
        return result;
    }

    static String decode(int hash, int length) {
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = decode((hash >> (i << 1)) & 3);
        }
        return new String(chars);
    }

    static int hashShiftRight(int hash, int length, char c) {
        return (hash >> 2) | (hash(c) << ((length - 1) << 1));
    }

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> result = new HashSet<>();
        final int length = 10;
        if (s.length() >= length) {
            int[] map = new int[1 << (length << 1)];
            char[] chars = s.toCharArray();
            int hash = hash(chars, 0, length);
            map[hash] = 1;
            for (int i = length; i < s.length(); i++) {
                hash = hashShiftRight(hash, length, chars[i]);
                map[hash] += 1;
                if (map[hash] > 1) {
                    result.add(decode(hash, length));
                }
            }
        }
        return new ArrayList<>(result);
    }

}