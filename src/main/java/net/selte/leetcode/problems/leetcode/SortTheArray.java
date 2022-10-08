package net.selte.leetcode.problems.leetcode;

import java.util.Arrays;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class SortTheArray {


    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 1};
        SortTheArray solution = new SortTheArray();
        int[] res = solution.sortArray(nums);
        System.out.println(Arrays.toString(res));

        int[] ints = solution.sortArray2(nums);
        System.out.println("ints = " + Arrays.toString(ints));

    }

    // 选择排序：每一轮选择最小元素交换到未排定部分的开头

    public int[] sortArray(int[] nums) {
        int len = nums.length;
        // 循环不变量：[0, i) 有序，且该区间里所有元素就是最终排定的样子
        for (int i = 0; i < len - 1; i++) {
            // 选择区间 [i, len - 1] 里最小的元素的索引，交换到下标 i
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            swap(nums, i, minIndex);
        }
        return nums;
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }


    public int[] sortArray2(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            while (j >= 0) {
                if (nums[j] > value) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
                j -= 1;
            }
            nums[j + 1] = value;
        }
        return nums;
    }

}
