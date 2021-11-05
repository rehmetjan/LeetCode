package com.example.leetcode.codewars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class LineNumberingTest {

    @Test
    public void test1() {
        List<String> number = LineNumbering.number(Arrays.asList("a", "b", "c"));
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), number);
    }

    @Test
    public void test2() {
        List<String> number = LineNumbering.number(Arrays.asList("1", "2", "3"));
        assertEquals(Arrays.asList("1: 1", "2: 2", "3: 3"), number);
    }

    @Test
    public void test3() {
        List<String> number = LineNumbering.number(Collections.emptyList());
        assertEquals(Collections.emptyList(), number);
    }
}
