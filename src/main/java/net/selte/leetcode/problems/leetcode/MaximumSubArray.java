package net.selte.leetcode.problems.leetcode;

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
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        int[] nums = new int[]{-1, 9, 3, -1};
        int i = maximumSubArray.maxSubArray(nums);
        System.out.println(i);
    }

    public int maxSubArray(int[] nums) {
        int previous = 0;
        int max = nums[0];
        for (int num : nums) {
            previous = Math.max(previous + num, num);
            max = Math.max(max, previous);
        }
        return max;
    }
}
