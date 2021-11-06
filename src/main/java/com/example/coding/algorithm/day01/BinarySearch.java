package com.example.coding.algorithm.day01;

import java.util.Arrays;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * <p>
 * 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target，
 * 写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *
 * <p>
 * 提示：
 * <p>
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class BinarySearch {

    public static void main(String[] args) {
        int result = search(new int[]{2, 3, 5, 7, 8, 9, 12, 34}, 12);
        int result2 = search2(new int[]{2, 3, 5, 7, 8, 9, 12, 34}, 12);
        int result3 = search3(new int[]{12, 23, 35, 37, 38, 49, 112, 234, 777}, 777);
        int result4 = Arrays.binarySearch(new int[]{12, 23, 35, 37, 38, 49, 112, 234, 777}, 12);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("Binary Search End");
        // 乘法除法
        System.out.println(18 << 1); // 36  [ n * 2 等价于 n << 1 ]
        System.out.println(5 << 2);  // 20  [ n * 4 等价于 n << 2 ]
        System.out.println(5 << 3);  // 40  [ n * 8 等价于 n << 2 ]
        System.out.println(8 >> 1);  // 4   [ n / 2 等价于 n >> 1 ]
        System.out.println(8 >> 2);  // 2   [ n / 4 等价于 n >> 2 ]
        System.out.println(8 >>> 1);  // 4   [ n / 2 等价于 n >> 1 ]
        // let's do some example
        System.out.println("Let's do some example");
        int high = 2100000000;
        int low = 2000000000;
        System.out.println("mid using >>> 1 = " + ((low + high) >>> 1));
        System.out.println("mid using / 2   = " + ((low + high) / 2));
        System.out.println("mid using >> 1 = " + ((low + high) >> 1));
    }

    public static int search3(int[] n, int t) {
        int r = n.length - 1;
        int l = 0;
        while (l <= r) {
            int m = (l + r) >>> 1;
            if (n[m] > t) r = m - 1;
            else if (n[m] < t) l = m + 1;
            else return m;
        }
        return -1;
    }

    public static int search2(int[] nums, int target) {

        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex <= rightIndex) {
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

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) { // 注意
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target)
                return mid;
                // 收缩右边界
            else if (nums[mid] > target)
                right = mid - 1;
                // 收缩左边界
            else // (nums[mid] < target)
                left = mid + 1;
        }
        return -1;
    }
}
