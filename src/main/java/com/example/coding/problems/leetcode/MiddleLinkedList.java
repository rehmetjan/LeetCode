package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

public class MiddleLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
