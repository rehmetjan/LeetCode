package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class NumberOf2Test {

    @Test
    public void test1() {
        int result = NumberOf2.numberOf2sInRange(25);
        assertEquals(9, result);
    }
}
