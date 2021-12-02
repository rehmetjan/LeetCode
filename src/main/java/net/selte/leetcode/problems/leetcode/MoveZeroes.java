package net.selte.leetcode.problems.leetcode;

import java.util.Arrays;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * <p>
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int left = 0;
        int right = 1;
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

        System.out.println(Arrays.toString(nums));
        int[] n = new int[]{0, 6, 0, 3, 0, 8};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.mvZero(n);
        System.out.println(Arrays.toString(n));

    }

    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int right = 0;
        int left = 0;
        while (right < length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    // Time O(n), Space O(n)
    public void mvZero(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;
        for (int num : nums) {
            if (num != 0) {
                temp[j] = num;
                j++;
            }
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }

    // Time O(n), Space O(n)
    public void mvZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }
}
