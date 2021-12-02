package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class BinarySearchTest {

    @Test
    public void test1() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(2, binarySearch.search(nums, 3));
    }

    @Test
    public void testF() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 12, 33, 49};
        System.out.println(13 / 2);
        assertEquals(1, binarySearch.search(nums, 12));
    }

    @Test
    public void testUnSorted() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 12, 5, 72, 1, 49};
        System.out.println(13 / 2);
        assertEquals(5, binarySearch.search(nums, 49));
    }

    @Test
    public void test2() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(-1, binarySearch.search(nums, 13));
    }

    @Test
    public void test3() {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {1, 2, 3};
        assertEquals(1, binarySearch.search(nums, 2));
    }
}
