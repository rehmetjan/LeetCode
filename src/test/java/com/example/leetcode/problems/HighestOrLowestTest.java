package com.example.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class HighestOrLowestTest {

    @Test
    public void test() {
        assertThat(HighestOrLowest.highAndLow("1 2 6 9"), is("9 1"));
    }

    @Test
    public void test2() {
        assertThat(HighestOrLowest.HighAndLow("1 22 2 6 9"), is("22 1"));
    }
}
