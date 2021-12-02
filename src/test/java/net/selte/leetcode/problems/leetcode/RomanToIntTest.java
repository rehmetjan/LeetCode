package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class RomanToIntTest {

    RomanToInt romanToInt = new RomanToInt();

    @Test
    void test1() {
        int xii = RomanToInt.romanToInt("XII");
        assertEquals(12, xii);
    }

    @Test
    void test2() {
        int fifty8 = RomanToInt.romanToInt("LVIII");
        assertEquals(58, fifty8);
    }

    @Test
    void test3() {
        int nnf = RomanToInt.romanToInt("MCMXCIV");
        assertEquals(1994, nnf);
    }

    @Test
    void test4() {
        int iii = romanToInt.romanToInteger("III");
        assertEquals(3, iii);
    }
}
