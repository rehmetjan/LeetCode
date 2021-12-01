package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class ContainsDuplicateTest {


    @Test
    void test1() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 1};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertTrue(result);
    }

    @Test
    void test2() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4};
        boolean result = containsDuplicate.containsDuplicate(nums);
        assertFalse(result);
    }
}
