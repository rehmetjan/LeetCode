package net.selte.leetcode.problems.codewars;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * Description:
 * Ask a small girl - "How old are you?". She always says strange things... Let's help her!
 * <p>
 * For correct answer program should return int from 0 to 9.
 * <p>
 * Assume test input string are always valid and may look like "1 year old" or
 * "5 years old", etc... The first char is number only.
 */
public class CharProblem {
    public static int howOld(final String herOld) {
        return Character.getNumericValue(herOld.charAt(0));
    }

    // leetcode 5

}
