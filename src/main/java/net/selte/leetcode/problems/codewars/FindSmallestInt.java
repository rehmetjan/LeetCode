package net.selte.leetcode.problems.codewars;

import java.util.Arrays;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class FindSmallestInt {

    public static int findSmallestInt2(int[] intArray) {
        return Arrays.stream(intArray).min().orElse(0);
    }

    public static int findSmallestInt(int[] intArray) {
        if (intArray == null) {
            throw new IllegalArgumentException("No solution found");
        }
        Arrays.sort(intArray);
        return intArray[0];
    }

}
