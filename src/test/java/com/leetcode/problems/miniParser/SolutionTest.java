package com.leetcode.problems.miniParser;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testDeserialize() throws Exception {
        assertEquals(null, SOLUTION.deserialize(null));
        assertEquals(null, SOLUTION.deserialize(""));
        assertEquals(new NestedInteger(123), SOLUTION.deserialize("123"));
        assertEquals(new NestedInteger(-456), SOLUTION.deserialize("-456"));
        assertEquals(new NestedInteger(), SOLUTION.deserialize("[]"));
        assertEquals(new NestedInteger().add(new NestedInteger(123)), SOLUTION.deserialize("[123]"));
        assertEquals(new NestedInteger().add(new NestedInteger(123)).add(new NestedInteger(456)), SOLUTION.deserialize("[123,456]"));
        assertEquals(new NestedInteger().
                add(new NestedInteger(123)).
                add(new NestedInteger(456)).
                add(new NestedInteger().
                        add(new NestedInteger(111)).
                        add(new NestedInteger()).
                        add(new NestedInteger().
                                add(new NestedInteger(678))
                        ).
                        add(new NestedInteger(6))).
                add(new NestedInteger(4)).
                add(new NestedInteger()), SOLUTION.deserialize("[123,456,[111,[],[678],6],4,[]]"));
    }

    @Test
    public void testParseInt() throws Exception {
        assertEquals(-12345, Solution.parseInt("abc-12345def".toCharArray(), 3, 9));
    }

}