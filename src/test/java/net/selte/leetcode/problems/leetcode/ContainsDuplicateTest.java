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
    int[] nums1_true = {1, 2, 3, 4, 1};
    int[] nums2_false = {1, 2, 3, 4};
    int[] nums3_true = {12, 21, 3, 12, 25};
    int[] nums4_false = {11, 2, 13, 4, 5};

    @Test
    void testSortedArray() {
        assertTrue(containsDuplicate.containsDuplicate(nums1_true));
        assertFalse(containsDuplicate.containsDuplicate(nums2_false));
        assertTrue(containsDuplicate.containsDuplicate(nums3_true));
        assertFalse(containsDuplicate.containsDuplicate(nums4_false));
    }

    @Test
    void testSet() {
        assertTrue(containsDuplicate.containsDup(nums1_true));
        assertFalse(containsDuplicate.containsDup(nums2_false));
        assertTrue(containsDuplicate.containsDup(nums3_true));
        assertFalse(containsDuplicate.containsDup(nums4_false));
    }
}
