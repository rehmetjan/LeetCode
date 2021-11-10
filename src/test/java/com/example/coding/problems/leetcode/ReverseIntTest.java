package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class ReverseIntTest {

    @Test
    public void test1() {
        ReverseInt reverseInt = new ReverseInt();
        int reverse = reverseInt.reverse(12);
        assertEquals(21, reverse);
    }

    @Test
    public void test2() {
        ReverseInt reverseInt = new ReverseInt();
        int reverse = reverseInt.reverse(129);
        assertEquals(921, reverse);
    }

    @Test
    public void test3() {
        ReverseInt reverseInt = new ReverseInt();
        int reverse = reverseInt.reverse(8129);
        assertEquals(9218, reverse);
    }
}
