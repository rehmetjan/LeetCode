package com.example.codewars;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class PositiveTest {
    @Test
    public void test1() {
        int sum = Positive.sum(new int[]{1, 2, 3});
        assertThat(sum, is(6));
    }

    @Test
    public void test2() {
        int sum = Positive.sum(new int[]{1, -12, 3});
        assertThat(sum, is(4));
    }
}
