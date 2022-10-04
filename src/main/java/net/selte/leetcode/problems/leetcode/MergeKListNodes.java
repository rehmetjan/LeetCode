package net.selte.leetcode.problems.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class MergeKListNodes {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;

        ListNode r1 = new ListNode(2);
        ListNode r2 = new ListNode(3);
        ListNode r3 = new ListNode(6);
        r1.next = r2;
        r2.next = r3;


        ListNode[] list = new ListNode[]{l1, r1};

        ListNode node = mergeKLists(list);

        System.out.println(node);

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> nodes = new ArrayList<>();
        for (ListNode list : lists) {
            while (list != null) {
                nodes.add(list);
                list = list.next;
            }
        }
        nodes.sort(Comparator.comparingInt((ListNode l) -> l.val));

        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (ListNode node : nodes) {
            cur.next = node;
            cur = cur.next;
            // this can simplify with below
            //cur = cur.next = node;
        }
        return head.next;
    }
}
