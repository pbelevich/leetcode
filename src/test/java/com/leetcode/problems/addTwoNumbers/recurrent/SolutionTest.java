package com.leetcode.problems.addTwoNumbers.recurrent;

import com.leetcode.problems.addTwoNumbers.ListNode;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void testAddTwoNumbers() throws Exception {
        assertThat(SOLUTION.addTwoNumbers(null, null), equalTo(null));

        assertThat(SOLUTION.addTwoNumbers(n(0), null), equalTo(n(0)));
        assertThat(SOLUTION.addTwoNumbers(null, n(0)), equalTo(n(0)));
        assertThat(SOLUTION.addTwoNumbers(n(0), n(0)), equalTo(n(0)));

        assertThat(SOLUTION.addTwoNumbers(n(1), null), equalTo(n(1)));
        assertThat(SOLUTION.addTwoNumbers(null, n(2)), equalTo(n(2)));
        assertThat(SOLUTION.addTwoNumbers(n(1), n(2)), equalTo(n(3)));

        assertThat(SOLUTION.addTwoNumbers(n(6), n(7)), equalTo(n(3, n(1))));

        assertThat(SOLUTION.addTwoNumbers(n(6, n(5, n(4, n(3)))), n(7, n(4, n(9, n(1))))), equalTo(n(3, n(0, n(4, n(5))))));

        assertThat(SOLUTION.addTwoNumbers(n(9, n(9, n(9))), n(1)), equalTo(n(0, n(0, n(0, n(1))))));

        assertThat(SOLUTION.addTwoNumbers(n(1), n(9, n(9, n(9)))), equalTo(n(0, n(0, n(0, n(1))))));

        assertThat(SOLUTION.addTwoNumbers(n(1, n(8)), n(0)), equalTo(n(1, n(8))));
        assertThat(SOLUTION.addTwoNumbers(n(3, n(2, n(1))), n(1)), equalTo(n(4, n(2, n(1)))));
        assertThat(SOLUTION.addTwoNumbers(n(3, n(2, n(1))), null), equalTo(n(3, n(2, n(1)))));

        assertThat(SOLUTION.addTwoNumbers(n(9), n(1, n(9, n(9, n(9, n(9, n(9, n(8, n(9, n(9, n(9))))))))))), equalTo(n(0, n(0, n(0, n(0, n(0, n(0, n(9, n(9, n(9, n(9))))))))))));
    }
    
    private ListNode n(int val, ListNode next) {
        ListNode result = new ListNode(val);
        result.next = next;
        return result;
    }

    private ListNode n(int val) {
        return n(val, null);
    }
    
}