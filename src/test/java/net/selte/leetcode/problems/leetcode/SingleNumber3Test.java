package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class SingleNumber3Test {

    @Test
    public void test1() {
        int[] nums = new int[]{1, 2, 1, 3, 2, 5};
        int[] expected = new int[]{3, 5};
        assertArrayEquals(expected, SingleNumber3.singleNumber(nums));
    }

    @Test
    public void test2() {
        int[] nums = new int[]{-1, 0};
        int[] expected = new int[]{-1, 0};
        assertArrayEquals(expected, SingleNumber3.singleNumber(nums));
    }

    @Test
    public void test3() {
        int[] nums = new int[]{0, 1};
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, SingleNumber3.singleNumber(nums));
    }

}
