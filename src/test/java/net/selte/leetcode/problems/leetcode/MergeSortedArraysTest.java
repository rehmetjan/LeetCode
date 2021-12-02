package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class MergeSortedArraysTest {

    @Test
    void test1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        MergeSortedArrays.merge(nums1, 3, nums2, 3);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void test2() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        MergeSortedArrays.merge(nums1, 3, nums2, 3);

        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, nums1);
    }

}
