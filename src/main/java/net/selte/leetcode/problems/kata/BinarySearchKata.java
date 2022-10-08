package net.selte.leetcode.problems.kata;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class BinarySearchKata {

    public static void main(String[] args) {
        int left = 40;
        int right = 80;

        int mid1 = (left + right) / 2;
        int mid2 = left + (right - left) / 2;

        System.out.println("mid1 = " + mid1);
        System.out.println("mid2 = " + mid2);

        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        BinarySearchKata binarySearchKata = new BinarySearchKata();
        int search = binarySearchKata.search(nums, 9);
        System.out.println("search = " + search);

    }

    /**
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
     * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：<a href="https://leetcode.cn/problems/binary-search">...</a>
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param nums   整型数组
     * @param target 目标值
     * @return 目标值存在返回下标，否则返回 -1
     */
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public int search2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }

        }
        return -1;
    }

}
