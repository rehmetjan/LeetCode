package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
class MaximumSubArrayTest {

    @Test
    public void test1() {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maximumSubArray.maxSubArray(nums);
        assertEquals(6, result);
    }

    @Test
    public void test2() {
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int[] nums = {-2};
        int result = maximumSubArray.maxSubArray(nums);
        assertEquals(-2, result);
    }
}
