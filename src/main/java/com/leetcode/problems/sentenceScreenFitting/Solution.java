package com.leetcode.problems.sentenceScreenFitting;

/**
 * https://leetcode.com/problems/sentence-screen-fitting/#/description
 * <p>
 * 418. Sentence Screen Fitting
 * <p>
 * Given a rows x cols screen and a sentence represented by a list of non-empty words, find how many times the given sentence can be fitted on the screen.
 * <p>
 * Note:
 * <p>
 * A word cannot be split into two lines.
 * The order of words in the sentence must remain unchanged.
 * Two consecutive words in a line must be separated by a single space.
 * Total words in the sentence won't exceed 100.
 * Length of each word is greater than 0 and won't exceed 10.
 * 1 ≤ rows, cols ≤ 20,000.
 * Example 1:
 * <p>
 * Input:
 * rows = 2, cols = 8, sentence = ["hello", "world"]
 * <p>
 * Output:
 * 1
 * <p>
 * Explanation:
 * hello---
 * world---
 * <p>
 * The character '-' signifies an empty space on the screen.
 * Example 2:
 * <p>
 * Input:
 * rows = 3, cols = 6, sentence = ["a", "bcd", "e"]
 * <p>
 * Output:
 * 2
 * <p>
 * Explanation:
 * a-bcd-
 * e-a---
 * bcd-e-
 * <p>
 * The character '-' signifies an empty space on the screen.
 * Example 3:
 * <p>
 * Input:
 * rows = 4, cols = 5, sentence = ["I", "had", "apple", "pie"]
 * <p>
 * Output:
 * 1
 * <p>
 * Explanation:
 * I-had
 * apple
 * pie-I
 * had--
 * <p>
 * The character '-' signifies an empty space on the screen.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public int wordsTyping(String[] sentence, int rows, int cols) {
        int result = 0;
        int word = 0;
        for (int r = 0; r < rows; r++) {
            int line = cols;
            boolean fit = false;
            while (sentence[word].length() <= line) {
                fit = false;
                line -= (sentence[word++].length() + 1);
                if (word == sentence.length) {
                    result++;
                    word = 0;
                    fit = true;
                }
            }
            if (fit) {
                int matches = rows / (r + 1);
                result = matches * result;
                rows -= matches * (r + 1);
                r = -1;
            }
        }
        return result;
    }

}
