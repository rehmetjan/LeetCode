package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
class SubArraySumTest {

    @Test
    void subarraySum() {
        SubArraySum c = new SubArraySum();
        int[] nums = new int[]{1, 2, 3};
        int k = 3;
        int result = c.subarraySum(nums, k);
        assertEquals(2, result);
    }

    @Test
    void subArraySum() {
        SubArraySum c = new SubArraySum();
        int[] nums = new int[]{6, 1, 3, 1, 4, 2, 5, 7};
        int k = 4;
        int result = c.subarraySum(nums, k);
        assertEquals(3, result);
    }

    @Test
    void subArraySum2() {
        int[] nums = new int[]{6, 1, 3, 1, 4, 2, 5, 7};
        int k = 4;
        int result = SubArraySum.subarraySum2(nums, k);
        assertEquals(3, result);
    }
}
