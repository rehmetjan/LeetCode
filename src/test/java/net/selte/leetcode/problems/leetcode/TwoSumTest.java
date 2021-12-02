package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

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
        int[] result = twoSum.twoSum(nums, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void test2() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{3, 2, 4};
        int[] result = twoSum.twoSum(nums, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void test3() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{3, 3};
        int[] result = twoSum.twoSum(nums, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void test4() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{3, 1, 6, 7, 13};
        int[] result = twoSum.twoSum(nums, 10);
        assertArrayEquals(new int[]{0, 3}, result);
    }
}
