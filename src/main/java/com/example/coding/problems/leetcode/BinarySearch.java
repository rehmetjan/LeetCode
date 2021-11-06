package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * int[] nums = {1,2,3,4,5,6,7,8,9};
 *               0
 * int[] nums = {1,12,33,49}; // target is 33
 *
 * nums.length = 4
 *               0  1  2  3
 *             left   |   right
 * left + right = 3
 * midpoint = 3 / 2 = 1
 *  nums[1] = 12
 *  33 > 12, so left = 1 + 1
 * assertEquals(2, binarySearch.search(nums, 3));
 *
 */
public class BinarySearch {
    public int search(int[] nums, int target) {

        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex<= rightIndex) {
            int midpoint = (leftIndex + rightIndex) / 2;
            if (target < nums[midpoint]) {
                rightIndex = midpoint - 1;
            } else if (target > nums[midpoint]) {
                leftIndex = midpoint + 1;
            } else {
                return midpoint;
            }
        }

        return -1;
    }
}
