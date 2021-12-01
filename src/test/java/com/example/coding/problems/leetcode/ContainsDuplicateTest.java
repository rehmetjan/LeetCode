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

    ContainsDuplicate containsDuplicate = new ContainsDuplicate();
    int[] nums1 = {1, 2, 3, 4, 1};
    int[] nums2 = {1, 2, 3, 4};

    @Test
    void test1() {
        assertTrue(containsDuplicate.containsDuplicate(nums1));
    }

    @Test
    void test2() {
        assertFalse(containsDuplicate.containsDuplicate(nums2));
    }
}
