package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int length = nums.length;
        int right = length - 1;
        while (left <= right) {
            int mid = (left + right) >> 1;
            // int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (target > nums[mid]) left = mid + 1;
            else if (target < nums[mid]) right = mid - 1;
        }
        return left;
    }
}
