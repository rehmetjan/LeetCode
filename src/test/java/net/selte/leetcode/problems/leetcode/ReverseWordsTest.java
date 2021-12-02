package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class ReverseWordsTest {

    ReverseWords reverseWords = new ReverseWords();

    @Test
    void test1() {
        String actual = reverseWords.reverseWords("I am Hero");
        String expect = "I ma oreH";
        assertEquals(expect, actual);
    }

    @Test
    void test2() {
        String actual = reverseWords.reverseWords2("I am Hero");
        String expect = "I ma oreH";
        assertEquals(expect, actual);
    }

    @Test
    void test3() {
        String actual = reverseWords.reverseWords3("I am Hero");
        String expect = "I ma oreH";
        assertEquals(expect, actual);
    }
}
