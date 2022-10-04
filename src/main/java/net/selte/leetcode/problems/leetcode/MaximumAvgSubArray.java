package net.selte.leetcode.problems.leetcode;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class MaximumAvgSubArray {

    public static void main(String[] args) {
        MaximumAvgSubArray c = new MaximumAvgSubArray();
        int[] nums = new int[]{1, 12, -5, -6, 50, 3, 32, 43, 54, -23, 54};
        int k = 3;
        double maxAverage = c.findMaxAverage(nums, k);
        System.out.println("maxAverage = " + maxAverage);

    }

    /**
     * findMaxAverage
     * 给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
     * 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
     * <p>
     * 任何误差小于 10-5 的答案都将被视为正确答案。
     * 来源：力扣（LeetCode）
     * 链接：<a href="https://leetcode.cn/problems/maximum-average-subarray-i">...</a>
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums array
     * @param k    int
     * @return double
     */

    public double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE;

        int now = 0;
        for (int i = 0; i < nums.length; i++) {
            now += nums[i];
            if (i - k >= 0) {
                now -= nums[i - k];
            }
            if (i + 1 >= k) {
                ans = Math.max(ans, (double) now / k);
            }
        }
        return ans;
    }
}
