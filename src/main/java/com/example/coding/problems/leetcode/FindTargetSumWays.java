package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class FindTargetSumWays {
    private int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums, 0, target, 0);
        return count;
    }

    private void dfs(int[] nums, int index, int target, int current) {
        if (index == nums.length) {
            if (target == current) {
                count++;
            }
            return;
        }

        dfs(nums, index + 1, target, current + nums[index]);
        dfs(nums, index + 1, target, current - nums[index]);
    }
}
