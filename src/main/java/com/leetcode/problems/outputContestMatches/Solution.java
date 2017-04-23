package com.leetcode.problems.outputContestMatches;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/output-contest-matches/#/description
 * <p>
 * 544. Output Contest Matches
 *
 * @author Pavel Belevich
 */
public class Solution {

    public String findContestMatch(int n) {
        List<String> matches = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            matches.add(String.valueOf(i));
        }
        while (matches.size() != 1) {
            List<String> newRound = new ArrayList<>(matches.size() >> 1);
            for (int i = 0; i < matches.size() / 2; i++) {
                newRound.add("(" + matches.get(i) + "," + matches.get(matches.size() - i - 1) + ")");
            }
            matches = newRound;
        }
        return matches.get(0);
    }

}
