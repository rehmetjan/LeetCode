package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class SearchInsertTest {

    private final SearchInsert searchInsert = new SearchInsert();

    @Test
    public void test1() {
        int[] nums = {1, 3, 5, 6};
        assertEquals(2, searchInsert.searchInsert(nums, 5));
    }

    @Test
    public void test2() {
        int[] nums = {1, 3, 5, 6};
        assertEquals(1, searchInsert.searchInsert(nums, 2));
    }

    @Test
    public void test3() {
        int[] nums = {1, 3, 5, 6};
        assertEquals(4, searchInsert.searchInsert(nums, 7));
    }

    @Test
    public void test4() {
        int[] nums = {1, 3, 5, 6};
        assertEquals(0, searchInsert.searchInsert(nums, 0));
    }

    @Test
    public void test5() {
        int[] nums = {1};
        assertEquals(0, searchInsert.searchInsert(nums, 0));
    }

}
