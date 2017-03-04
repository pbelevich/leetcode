package com.leetcode.problems.textJustification;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/text-justification/
 *
 * 68. Text Justification
 *
 * Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.
 *
 * You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly L characters.
 *
 * Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
 *
 * For the last line of text, it should be left justified and no extra space is inserted between words.
 *
 * For example,
 * words: ["This", "is", "an", "example", "of", "text", "justification."]
 * L: 16.
 *
 * Return the formatted lines as:
 * [
 * "This    is    an",
 * "example  of text",
 * "justification.  "
 * ]
 * Note: Each word is guaranteed not to exceed L in length.
 *
 * click to show corner cases.
 *
 * Corner Cases:
 * A line other than the last line might contain only one word. What should you do in this case?
 * In this case, that line should be left-justified.
 *
 * @author Pavel Belevich
 */
public class Solution {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        int currLength = 0;
        for (String word : words) {
            int newLength = newLength(currLength, word.length());
            if (newLength <= maxWidth) {
                curr.add(word);
                currLength = newLength;
            } else {
                result.add(createLine(curr, maxWidth));
                curr = new ArrayList<>();
                curr.add(word);
                currLength = newLength(0, word.length());
            }
        }
        result.add(createLastLine(curr, maxWidth));
        return result;
    }

    private String createLine(List<String> curr, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        int wordsLength = 0;
        for (String word : curr) {
            wordsLength += word.length();
        }
        int whiteSpaces = maxWidth - wordsLength;
        if (curr.size() == 1) {
            sb.append(curr.get(0));
            appendWhiteSpaces(sb, whiteSpaces);
        } else if (curr.size() > 1) {
            int whiteSpaceLength = whiteSpaces / (curr.size() - 1);
            int reminder = whiteSpaces % (curr.size() - 1);
            sb.append(curr.get(0));
            for (int i = 1; i < curr.size(); i++) {
                if (reminder > 0) {
                    sb.append(' ');
                    reminder--;
                }
                appendWhiteSpaces(sb, whiteSpaceLength);
                sb.append(curr.get(i));
            }
        }
        return sb.toString();
    }

    private String createLastLine(List<String> curr, int maxWidth) {
        StringBuilder sb = new StringBuilder();
        int length = 0;
        sb.append(curr.get(0));
        length += curr.get(0).length();
        for (int i = 1; i < curr.size(); i++) {
            sb.append(' ');
            sb.append(curr.get(i));
            length += 1 + curr.get(i).length();
        }
        appendWhiteSpaces(sb, maxWidth - length);
        return sb.toString();
    }

    private void appendWhiteSpaces(StringBuilder sb, int whiteSpaces) {
        for (int i = 0; i < whiteSpaces; i++) {
            sb.append(' ');
        }
    }

    private int newLength(int currLength, int wordLength) {
        if (currLength == 0) {
            return wordLength;
        } else {
            return currLength + 1 + wordLength;
        }
    }

}