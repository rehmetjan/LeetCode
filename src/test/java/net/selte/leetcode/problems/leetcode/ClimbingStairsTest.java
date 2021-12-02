package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class ClimbingStairsTest {

    @Test
    public void test1() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    public void test2() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    public void test3() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        assertEquals(89, climbingStairs.climbStairs(10));
    }
}
