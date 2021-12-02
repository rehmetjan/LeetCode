package net.selte.leetcode.algorithm.day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class BinarySearchTrainingTest {

    @Test
    public void test1() {
        int result = BinarySearchTraining.search3(new int[]{1, 4, 7, 8}, 4);
        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = BinarySearchTraining.search3(new int[]{1, 4, 7, 8}, 3);
        assertEquals(-1, result);
    }

}
