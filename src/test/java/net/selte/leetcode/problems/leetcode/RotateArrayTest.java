package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class RotateArrayTest {

    @Test
    public void test1() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    public void test2() {
        RotateArray rotateArray = new RotateArray();
        int[] nums = new int[]{-1, -100, 3, 99};
        rotateArray.rotate(nums, 2);
        assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }

}
