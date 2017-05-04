package com.leetcode.problems.reconstructItinerary;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    @Test
    public void findItinerary1() throws Exception {
        assertEquals(Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO"),
                new Solution().findItinerary(new String[][]{{"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}, {"ATL", "JFK"}, {"ATL", "SFO"}}));
    }

    @Test
    public void findItinerary2() throws Exception {
        assertEquals(Arrays.asList("JFK", "MUC", "LHR", "SFO", "SJC"),
                new Solution().findItinerary(new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}}));
    }

    @Test
    public void findItinerary3() throws Exception {
        assertEquals(Arrays.asList("JFK", "NRT", "JFK", "KUL"),
                new Solution().findItinerary(new String[][]{{"JFK", "KUL"}, {"JFK", "NRT"}, {"NRT", "JFK"}}));
    }

    @Test
    public void findItinerary4() throws Exception {
        assertEquals(Arrays.asList("JFK", "NRT", "JFK", "KUL"),
                new Solution().findItinerary(new String[][]{{"JFK", "KUL"}, {"JFK", "NRT"}, {"NRT", "JFK"}}));
    }

}