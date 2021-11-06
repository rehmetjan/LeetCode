package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class TwoSumTest {

    @Test
    public void test1() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(result));
    }

    @Test
    public void test2() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(result));
    }

    @Test
    public void test3() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{3, 3};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(result));
    }
}
