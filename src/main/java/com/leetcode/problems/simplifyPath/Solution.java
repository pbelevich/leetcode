package com.leetcode.problems.simplifyPath;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Pavel Belevich
 */
public class Solution {

    public String simplifyPath(String path) {
        char[] chars = path.toCharArray();
        Deque<String> stack = new LinkedList<>();
        for (int begin = 1, end = 1; end <= chars.length; end++) {
            if (end == path.length() || chars[end] == '/') {
                String part = path.substring(begin, end);
                switch (part) {
                    case "":
                    case ".":
                        break;
                    case "..":
                        if (!stack.isEmpty()) {
                            stack.removeLast();
                        }
                        break;
                    default:
                        stack.addLast(part);
                }
                begin = end + 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        Iterator<String> iterator = stack.iterator();
        if (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        while (iterator.hasNext()) {
            sb.append("/").append(iterator.next());
        }
        return sb.toString();
    }

}