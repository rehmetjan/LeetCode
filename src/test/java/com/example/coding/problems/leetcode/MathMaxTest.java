package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class MathMaxTest {

    @Test
    public void test1() {
        MathMax mathMax = new MathMax();
        int max = mathMax.max(2, 3);
        assertEquals(3, max);
    }

    @Test
    public void test2() {
        MathMax mathMax = new MathMax();
        int max = mathMax.max(21, 3);
        assertEquals(21, max);
    }

    @Test
    public void test3() {
        MathMax mathMax = new MathMax();
        int max = mathMax.max(3, 3);
        assertEquals(0, max);
    }
}
