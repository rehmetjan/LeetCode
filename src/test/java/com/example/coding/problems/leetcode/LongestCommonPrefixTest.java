package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class LongestCommonPrefixTest {

    @Test
    public void test1() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String common = solution.longestCommonPrefix(new String[]{"flower","flow","flight"});
        assertEquals("fl", common);
    }

    @Test
    public void test2() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String common = solution.longestCommonPrefix(new String[]{"dog","racecar","car"});
        assertEquals("", common);
    }

    @Test
    public void test3() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String common = solution.longestCommonPrefix(new String[]{"computer","complete","company"});
        assertEquals("comp", common);
    }

    @Test
    public void testWhenItsnull() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String common = solution.longestCommonPrefix(null);
        assertEquals("", common);
    }

    @Test
    public void testWhenItsNull() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String common = solution.longestCommonPrefix(new String[]{});
        assertEquals("", common);
    }

    @Test
    public void testWhenItsONe() {
        LongestCommonPrefix solution = new LongestCommonPrefix();
        String common = solution.longestCommonPrefix(new String[]{"a"});
        assertEquals("a", common);
    }
}
