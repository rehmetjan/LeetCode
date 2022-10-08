package net.selte.leetcode.problems.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
class BinarySearchKataTest {

    BinarySearchKata binarySearchKata = new BinarySearchKata();

    @Test
    void search() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12, 15, 17, 18, 23, 29, 33, 45, 66, 77};
        int target = 9;
        int search = binarySearchKata.search(nums, target);
        assertEquals(4, search);
    }

    @Test
    void search2() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        int search = binarySearchKata.search2(nums, target);
        assertEquals(4, search);
    }

    @Test
    void searchFalse() {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 2;
        int search = binarySearchKata.search(nums, target);
        assertEquals(-1, search);
    }
}
