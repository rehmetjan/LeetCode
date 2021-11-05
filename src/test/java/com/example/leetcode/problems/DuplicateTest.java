package com.example.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class DuplicateTest {

    @Test
    public void test1() {
        Duplicate duplicate = new Duplicate();
        int[] nums = {1,2,3,7,5,5};
        boolean containsDuplicate = duplicate.containsDuplicate(nums);
        assertTrue(containsDuplicate);
    }

    @Test
    public void test2() {
        Duplicate duplicate = new Duplicate();
        int[] nums = {1,2,3,7,5};
        boolean containsDuplicate = duplicate.containsDuplicate(nums);
        assertFalse(containsDuplicate);
    }

}
