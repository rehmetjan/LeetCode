package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class RemoveDuplicateTest {
    @Test
    public void test1() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] nums = {1, 1, 2};
        assertEquals(2, removeDuplicate.removeDuplicates(nums));
    }

    @Test
    public void test2() {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] nums = {1, 1, 1, 2, 3, 3, 3, 6, 7, 7}; // {1,2,3,6,7} 5
        assertEquals(5, removeDuplicate.removeDuplicates(nums));
    }
}
