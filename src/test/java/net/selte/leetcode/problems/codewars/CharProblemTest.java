package net.selte.leetcode.problems.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class CharProblemTest {

    @Test
    void test1() {
        int age = CharProblem.howOld("5 years old");
        assertEquals(5, age);
    }
    @Test
    void test2() {
        int age = CharProblem.howOld("6 years old");
        assertEquals(6, age);
    }
    @Test
    void test3() {
        int age = CharProblem.howOld("7 years old");
        assertEquals(7, age);
    }

}
