package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class RomanEncoderTest {

    @Test
    public void shouldReturnM() {
        assertThat(RomanEncoder.toRoman(1000), is("M"));
    }

    @Test
    public void shouldReturnV() {
        assertThat(RomanEncoder.toRoman(5), is("V"));
    }

    @Test
    public void shouldReturnXV() {
        assertThat(RomanEncoder.toRoman(15), is("XV"));
    }

    @Test
    public void shouldReturnMMXV() {
        assertThat(RomanEncoder.toRoman(2018), is("MMXVIII"));
    }


}
