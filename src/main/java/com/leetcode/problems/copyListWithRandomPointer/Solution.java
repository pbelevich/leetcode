package com.leetcode.problems.copyListWithRandomPointer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode result = null;
        RandomListNode curr;
        RandomListNode prev = null;
        for (RandomListNode i = head; i != null; i = i.next) {
            curr = new RandomListNode(i.label);
            if (result == null) {
                result = curr;
            }
            map.put(i, curr);
            if (prev != null) {
                prev.next = curr;
            }
            prev = curr;
        }

        for (RandomListNode i = head, j = result; i != null; i = i.next, j = j.next) {
            j.random = map.get(i.random);
        }

        return result;
    }

}
