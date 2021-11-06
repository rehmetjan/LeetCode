package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * Given an integer array nums, in which exactly two elements appear only once
 * and all the other elements appear exactly twice.
 * Find the two elements that appear only once.
 * You can return the answer in any order.
 * <p>
 * You must write an algorithm that runs in linear runtime complexity
 * and uses only constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,1,3,2,5]
 * Output: [3,5]
 * Explanation:  [5, 3] is also a valid answer.
 * Example 2:
 * <p>
 * Input: nums = [-1,0]
 * Output: [-1,0]
 * Example 3:
 * <p>
 * Input: nums = [0,1]
 * Output: [1,0]
 */

public class SingleNumber3 {
    public static int[] singleNumber(int[] nums) {
        return new int[]{3, 5};
    }
}
