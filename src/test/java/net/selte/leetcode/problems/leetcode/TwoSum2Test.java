package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class TwoSum2Test {

    @Test
    public void test1() {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] result = twoSum2.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{1, 2}, result);
    }

}
