package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class MedianSortedArraysTest {

    @Test
    void test1() {
        MedianSortedArrays mda = new MedianSortedArrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = mda.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result);
    }

    @Test
    void test2() {
        MedianSortedArrays mda = new MedianSortedArrays();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double result = mda.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.50, result);
    }

}
