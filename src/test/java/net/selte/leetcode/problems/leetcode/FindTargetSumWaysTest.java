package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class FindTargetSumWaysTest {

    @Test
    public void test1() {
        FindTargetSumWays findTargetSumWays = new FindTargetSumWays();
        int sumWays = findTargetSumWays.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3);
        assertEquals(5, sumWays);
    }

    @Test
    public void test2() {
        FindTargetSumWays findTargetSumWays = new FindTargetSumWays();
        int sumWays = findTargetSumWays.findTargetSumWays(new int[]{1}, 1);
        assertEquals(1, sumWays);
    }
}
