package net.selte.leetcode.problems.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 * @version 1.0
 * @since 1.0
 */
@Slf4j
public class SubArraySum {


    public static void main(String[] args) {

        SubArraySum c = new SubArraySum();

        int[] arr = new int[]{3, 3, 6, 1, 3, 1, 4, 2, 5, 7};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int subArraySum = 0;
            for (int j = i; j < arr.length; j++) {
                subArraySum += arr[j];
                System.out.println("subArraySum = " + subArraySum);
                if (subArraySum == 7) {
                    count++;
                    System.out.println("count = " + count);
                }
            }
        }
        System.out.println("sum = " + sum);
        System.out.println(Arrays.toString(arr));
        int result = c.subArraySum(arr, 7);
        System.out.println("result = " + result);
    }


    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的连续子数组的个数 。<p>
     * 示例 1：<p>
     * 输入：nums = [1,1,1], k = 2<p>
     * 输出：2<p>
     * 示例 2：<p>
     * 输入：nums = [1,2,3], k = 3<p>
     * 输出：2<p>
     *
     * @param nums 整数数组
     * @param k    整数
     * @return int
     */
    public int subarraySum(int[] nums, int k) {

        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Second Version
     * <p>
     * Given an array of integers nums and an integer k, return the total number of sub-arrays whose sum equals to k.
     * <p>
     * A subarray is a contiguous non-empty sequence of elements within an array.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,1,1], k = 2
     * <p>
     * Output: 2
     * <p>
     * Example 2:
     * <p>
     * Input: nums = [1,2,3], k = 3
     * <p>
     * Output: 2
     * <p>
     *
     * @param nums given array
     * @param k    integer k, numbers of subarrays
     * @return total number of subarray whose sum equal to k
     * @see #subarraySum(int[], int)
     * @since 1.0
     */
    public int subArraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for (int num : nums) {
            pre += num;
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);

            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }

    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的连续子数组的个数 。<p>
     * 示例 1：<p>
     * 输入：nums = [1,1,1], k = 2<p>
     * 输出：2<p>
     * 示例 2：<p>
     * 输入：nums = [1,2,3], k = 3<p>
     * 输出：2<p>
     *
     * @param nums 整数数组
     * @param k    整数
     * @return int
     */
    public static int subarraySum2(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int ref;

            System.out.println("outer loop: i = " + i);
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                ref = sum;
                System.out.println("  sum = sum + nums[" + j + "] : " + sum + " + " + nums[j] + " = " + ref);
//                log.info("sum = {}", sum);
                if (sum == k) {
                    System.out.println(k + " sum == k =>" + sum);
                    count++;
                }
            }
        }
        return count;
    }
}
