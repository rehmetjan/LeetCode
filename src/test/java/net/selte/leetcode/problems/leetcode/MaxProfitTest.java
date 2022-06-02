package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
class MaxProfitTest {

    @Test
    public void test1() {
        int[] nums = {7, 1, 5, 3, 6, 4};

        MaxProfit maxProfit = new MaxProfit();
        int i = maxProfit.maxProfit(nums);

        assertEquals(5, i);
    }
}
