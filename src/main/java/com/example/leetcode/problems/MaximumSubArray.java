package com.example.leetcode.problems;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），
 * 返回其最大和。
 * for (int i = 1; i < nums.length; i++) {
 * nums[i] = Math.max(nums[i], nums[i] + nums[i-1]);
 * }
 * <p>
 * int max = nums[0];
 * for (int i = 1; i < nums.length; i++) {
 * max = Math.max(nums[i], max);
 * }
 * <p>
 * return max;
 */
public class MaximumSubArray {
    public static void main(String[] args) {
        int max = Math.max(2, 7);

        System.out.println(Math.PI);
        System.out.println(max);
    }



    public int maxSubArray(int[] nums) {
        // for (int i = 1; i < nums.length; i++) {
        //     nums[i] = Math.max(nums[i], nums[i] + nums[i-1]);
        // }

        // int max = nums[0];
        // for (int i = 1; i < nums.length; i++) {
        //     max = Math.max(nums[i], max);
        // }

        // return max;
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;

    }
}
