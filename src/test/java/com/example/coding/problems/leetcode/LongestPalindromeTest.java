package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class LongestPalindromeTest {

    @Test
    void test1() {
        String str = LongestPalindrome.longestPalindrome("sanam");
        assertEquals("ana", str);
    }

    @Test
    void test2() {
        String str = LongestPalindrome.longestPalindrome("rehe");
        assertEquals("ehe", str);
    }
}
