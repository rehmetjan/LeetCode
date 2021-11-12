package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class SquaresOfSortedArrayTest {

    @Test
    public void test1() {
        SquaresOfSortedArray squares = new SquaresOfSortedArray();
        int[] result = squares.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, result);
    }

    @Test
    public void test2() {
        SquaresOfSortedArray squares = new SquaresOfSortedArray();
        int[] result = squares.sortedSquares(new int[]{-7, -3, 2, 3, 11});
        assertArrayEquals(new int[]{4, 9, 9, 49, 121}, result);
    }

}
