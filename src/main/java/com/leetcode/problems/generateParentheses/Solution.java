package com.leetcode.problems.generateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/#/description
 * <p>
 * 22. Generate Parentheses
 * <p>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * For example, given n = 3, a solution set is:
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n > 0) {
            generateParenthesis(new char[n << 1], 0, 0, n, result);
        }
        return result;
    }

    private void generateParenthesis(char[] chars, int i, int stack, int n, List<String> result) {
        if (i == chars.length) {
            result.add(new String(chars));
        } else {
            if (n > 0) {
                chars[i] = '(';
                generateParenthesis(chars, i + 1, stack + 1, n - 1, result);
            }
            if (stack > 0) {
                chars[i] = ')';
                generateParenthesis(chars, i + 1, stack - 1, n, result);
            }
        }
    }

}
