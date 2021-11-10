package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

public class AddTwoNumbers {

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode l3 = new ListNode(3, new ListNode());
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        System.out.println("l1.val = " + l1.val);
        System.out.println("l1.next = " + l1.next.val);
        System.out.println("l1.next.next = " + l1.next.next.val);

        ListNode l6 = new ListNode(6, new ListNode());
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);

        System.out.println("l4.val = " + l4.val);
        System.out.println("l4.next = " + l4.next.val);
        System.out.println("l4.next.next = " + l4.next.next.val);

        ListNode listNode = addTwoNumbers.addTwoNumbers(l1, l4);

        System.out.println(listNode.val);
        System.out.println(listNode.next.val);


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
