package com.leetcode.problems.shortestWordDistanceII;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class WordDistanceTest {

    @Test
    public void shortest() throws Exception {
        final WordDistance wordDistance = new WordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"});
        assertEquals(3, wordDistance.shortest("coding", "practice"));
        assertEquals(1, wordDistance.shortest("makes", "coding"));
    }

}