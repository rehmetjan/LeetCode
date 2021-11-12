package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class FindTheFirstAndLastTest {

    @Test
    public void test1() {
        FindTheFirstAndLast findTheFirstAndLast = new FindTheFirstAndLast();
        int[] nums = {
                1, 2, 3, 4, 6, 6, 6, 6, 6, 7, 8, 9, 10
        };

        int target = 6;
        int[] ints = findTheFirstAndLast.searchRanged(nums, target);

        assertThat(4, is(ints[0]));
        assertThat(8, is(ints[1]));

    }

    @Test
    public void test2() {
        assertThat("a", is("a"));
    }
}
