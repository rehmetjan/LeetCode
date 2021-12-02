package net.selte.leetcode.problems.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class FindSmallestIntTest {

    @Test
    public void test1() {
        int[] intArray = {1, 2, 4, 1, 38};
        assertEquals(1, FindSmallestInt.findSmallestInt(intArray));
    }

    @Test
    public void test0() {
        int[] intArray = {};
        //assertEquals(0, FindSmallestInt.findSmallestInt(intArray));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> FindSmallestInt.findSmallestInt(intArray));
    }

    @Test
    public void testNull() {
        //assertEquals(0, FindSmallestInt.findSmallestInt(intArray));
        assertThrows(IllegalArgumentException.class, () -> FindSmallestInt.findSmallestInt(null));
    }

    @Test
    public void test4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> FindSmallestInt.findSmallestInt(null));
        assertEquals(exception.getMessage(), "No solution found");
    }

    @Test
    public void test2() {
        int[] intArray = {-1, -4};
        assertEquals(-4, FindSmallestInt.findSmallestInt(intArray));
    }


}
