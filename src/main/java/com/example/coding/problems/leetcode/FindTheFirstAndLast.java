package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class FindTheFirstAndLast {

    public static void main(String[] args) {
        FindTheFirstAndLast findTheFirstAndLast = new FindTheFirstAndLast();
        int[] nums = {1, 2, 5, 6, 6, 7, 8};
        int[] ints = findTheFirstAndLast.searchRange(nums, 6);
        for (int num : ints) {
            System.out.println(num);
        }
    }

    public int[] searchRanged(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int start = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target)
                high = mid - 1;
            else if (nums[mid] < target)
                low = mid + 1;
            else {
                start = mid;
                high = mid - 1;
            }
        }
        int end = -1;
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] > target)
                high = mid - 1;
            else if (nums[mid] < target)
                low = mid + 1;
            else {
                end = mid;
                low = mid + 1;
            }
        }

        return new int[]{start, end};
    }

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        return result;
    }

    private int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (nums[midpoint] >= target) {
                end = midpoint - 1;
            } else {
                start = midpoint + 1;
            }
            if (nums[midpoint] == target) index = midpoint;
        }
        return index;
    }

    private int findEndingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (nums[midpoint] <= target) {
                end = midpoint + 1;
            } else {
                start = midpoint - 1;
            }
            if (nums[midpoint] == target) index = midpoint;
        }
        return index;
    }
}
