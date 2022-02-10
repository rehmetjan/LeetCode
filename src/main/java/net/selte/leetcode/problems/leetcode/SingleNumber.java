package net.selte.leetcode.problems.leetcode;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
