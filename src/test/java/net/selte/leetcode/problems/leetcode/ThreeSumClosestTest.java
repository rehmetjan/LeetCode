package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class ThreeSumClosestTest {
    ThreeSumClosest klass = new ThreeSumClosest();

    @Test
    void test1() {
        int[] nums = new int[]{-1, 2, 1, -4};
        int target = 1;
        int result = klass.threeSumClosest(nums, target);
        assertEquals(2, result);
    }
}
