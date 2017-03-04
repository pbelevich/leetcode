package com.leetcode.problems.textJustification;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void fullJustify() throws Exception {
        assertEquals(Arrays.asList("This    is    an", "example  of text", "justification.  "), SOLUTION.fullJustify(new String[] {"This", "is", "an", "example", "of", "text", "justification."}, 16));
        assertEquals(Arrays.asList("What must be","shall be.   "), SOLUTION.fullJustify(new String[] {"What","must","be","shall","be."}, 12));
        assertEquals(Arrays.asList("Don't  go  around  saying  the","world  owes  you a living; the","world owes you nothing; it was","here first.                   "), SOLUTION.fullJustify(new String[] {"Don't","go","around","saying","the","world","owes","you","a","living;","the","world","owes","you","nothing;","it","was","here","first."}, 30));
    }

}