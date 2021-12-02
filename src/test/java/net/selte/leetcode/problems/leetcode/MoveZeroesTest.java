package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class MoveZeroesTest {

    @Test
    public void test1() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = new int[]{0, 2, 0, 4, 1};
        moveZeroes.moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{2, 4, 1, 0, 0}, nums);
    }

    @Test
    public void test2() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

    @Test
    public void test3() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes.mvZeroes(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
    }

}
