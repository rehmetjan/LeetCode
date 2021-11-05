package com.example.leetcode.problems;

import java.util.HashMap;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class TwoSum {

    public int[] twoSum2(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Answer");
    }

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>(length - 1);
        hashMap.put(nums[0], 0);
        for (int i = 1; i < length; i++) {
            if (hashMap.containsKey(target - nums[i])){
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
