package net.selte.leetcode.problems.leetcode;

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
    int[] nums3 = {12, 21, 3, 12, 25};
    int[] nums4 = {11, 2, 13, 4, 5};

    @Test
    void test1() {
        assertTrue(containsDuplicate.containsDuplicate(nums1));
    }

    @Test
    void test1Set() {
        assertTrue(containsDuplicate.containsDup(nums1));
    }

    @Test
    void test2() {
        assertFalse(containsDuplicate.containsDuplicate(nums2));
    }

    @Test
    void test2Set() {
        assertFalse(containsDuplicate.containsDup(nums2));
    }

    @Test
    void test3() {
        assertTrue(containsDuplicate.containsDuplicate(nums3));
    }

    @Test
    void test3Set() {
        assertTrue(containsDuplicate.containsDup(nums3));
    }

    @Test
    void test4() {
        assertFalse(containsDuplicate.containsDuplicate(nums4));
    }

    @Test
    void test4Set() {
        assertFalse(containsDuplicate.containsDup(nums4));
    }
}
