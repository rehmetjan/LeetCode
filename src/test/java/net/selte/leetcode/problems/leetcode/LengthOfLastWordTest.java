package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class LengthOfLastWordTest {
    @Test
    public void test1() {
        LengthOfLastWord length = new LengthOfLastWord();
        Assertions.assertEquals(5, length.lengthOfLastWord("Hello World"));
    }

    @Test
    public void test2() {
        LengthOfLastWord length = new LengthOfLastWord();
        Assertions.assertEquals(4, length.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    public void test3() {
        LengthOfLastWord length = new LengthOfLastWord();
        Assertions.assertEquals(6, length.lengthOfLastWord1("luffy is still joyboy"));
    }

}
