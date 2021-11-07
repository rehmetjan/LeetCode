package com.example.coding.problems.newcoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class NC103Test {

    @Test
    public void test1() {
        assertEquals("temher", NC103.solve("rehmet"));
    }

    @Test
    public void test2() {
        assertEquals("", NC103.solve(""));
    }

    @Test
    public void test3() {
        assertEquals("temher", NC103.solve2("rehmet"));
    }

    @Test
    public void test4() {
        assertEquals("", NC103.solve2(""));
    }

}
