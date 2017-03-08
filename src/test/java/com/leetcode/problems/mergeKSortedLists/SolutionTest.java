package com.leetcode.problems.mergeKSortedLists;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Pavel Belevich
 */
public class SolutionTest {

    public static final Solution SOLUTION = new Solution();

    @Test
    public void mergeKLists() throws Exception {
        assertEquals(new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))), SOLUTION.mergeKLists(new ListNode[] {
                null,
                new ListNode(5),
                new ListNode(3, new ListNode(7)),
                null,
                new ListNode(1, new ListNode(4, new ListNode(6)))
        }));
    }

    @Test
    public void mergeKListsLarge() throws Exception {
        List<String> strings = Files.readAllLines(Paths.get(getClass().getResource("/com/leetcode/problems/mergeKSortedLists/data.txt").toURI()));
        Comparator<ListNode> comparing = Comparator.comparing(n -> n.val);
        Comparator<ListNode> reversed = comparing.reversed();
        ListNode expected = strings.stream().mapToInt(Integer::valueOf).mapToObj(ListNode::new).sorted(reversed).reduce((a, b) -> {
            b.next = a;
            return b;
        }).orElse(null);
        ListNode[] lists = strings.stream().mapToInt(Integer::valueOf).mapToObj(ListNode::new).toArray(ListNode[]::new);
        ListNode actual = SOLUTION.mergeKLists(lists);
        assertEquals(expected, actual);
    }

}
