package com.example.coding.problems.leetcode;

import java.util.Arrays;
import java.util.HashMap;

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
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int[] ret = new int[2];
        int ct = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                ret[ct++] = key;
            }
        }
        return ret;
    }

    public static int[] singleNumber2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < len; ) {
            if (i != len - 1 && nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                if (result[0] == 0) {
                    result[0] = nums[i];
                } else {
                    result[1] = nums[i];
                }
                i++;
            }
        }
        return result;
    }
}

