package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
class SortAnArrayTest {
    SortAnArray sortAnArray = new SortAnArray();

    @Test
    public void sort1() {
        int[] nums = new int[]{1, 3, 2, 4, 9, -1};
        int[] expected = new int[]{-1, 1, 2, 3, 4, 9};
        int[] ints = sortAnArray.sortArray(nums);
        assertArrayEquals(expected, ints);
    }

    @Test
    public void sort2() {
        int[] nums = new int[]{1, 3, 2};
        int[] expected = new int[]{1, 2, 3};
        int[] ints = sortAnArray.sortArray(nums);
        assertArrayEquals(expected, ints);
    }


}
