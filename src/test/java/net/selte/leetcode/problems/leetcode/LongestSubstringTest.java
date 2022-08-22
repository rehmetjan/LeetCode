package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
class LongestSubstringTest {

    @Test
    void lengthOfLongestSubstring() {
        LongestSubstring longestSubstring = new LongestSubstring();
        int bbbb = longestSubstring.lengthOfLongestSubstring("bbbb");
        assertEquals(1, bbbb);
    }
}
