package com.leetcode.problems.removeInvalidParentheses;

import org.junit.Test;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void test() throws Exception {
        System.out.println(time(new Runnable() {
            @Override
            public void run() {
                SOLUTION.removeInvalidParentheses("(a)())()(");
            }
        }));
        System.out.println(time(new Runnable() {
            @Override
            public void run() {
                SOLUTION.removeInvalidParentheses("((()((s((((()");
            }
        }));
        System.out.println(time(new Runnable() {
            @Override
            public void run() {
                SOLUTION.removeInvalidParentheses("())((((((((((b))(");
            }
        }));
    }

    long time(Runnable r) {
        long start = System.nanoTime();
        r.run();
        return System.nanoTime() - start;
    }

}