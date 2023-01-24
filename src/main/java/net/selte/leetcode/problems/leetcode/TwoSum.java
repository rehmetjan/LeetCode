package net.selte.leetcode.problems.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class TwoSum {

    public static void main(String[] args) {
        // array = [1, 4, 7, 9]
        // target = 11
        // 请找出 4， 7
        // 0 - > 1, 1 -> 4
        // [1, 2]

        int[] array = new int[] {1, 4, 7, 9};
        System.out.println("array = " + Arrays.toString(array));
//        System.out.println("array[3] = " + array[3]);

        for (int i = 0; i < array.length; i++) {
            System.out.println("array["+i+"] = " + array[i]);
        }

        int target = 11;
        int[] result = twoSumNew(array, target);

        System.out.println("result = " + Arrays.toString(result));



    }

    public static int[] twoSumNew(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[]{0, 0};
    }


    @SuppressWarnings("unused")
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
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
