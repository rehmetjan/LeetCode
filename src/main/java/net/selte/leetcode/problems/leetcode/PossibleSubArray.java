package net.selte.leetcode.problems.leetcode;

import java.util.*;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class PossibleSubArray {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 3, 1, 1, 1, 2, 4};
        int k = 4;
        System.out.println("Given array : " + Arrays.toString(nums));
        System.out.println("target sum should be: " + k);
        List<int[]> list = possibleIntArray(nums, k);
        list.forEach(arr -> System.out.println(Arrays.toString(arr)));
    }

    /**
     * given an integer array, [1,2,3,4]
     * return a list of all possible integer sub array.
     *
     * @param nums given array
     * @param k    given int
     * @return a list
     */
    public static List<int[]> possibleIntArray(int[] nums, int k) {
        ArrayList<int[]> list = new ArrayList<>();
        ArrayList<Integer> arrList = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();

            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                map.put(j, nums[j]);
                sum += nums[j];
                if (sum == k) {
                    arrList.add(map.get(j));
                    count++;
                    System.out.println("arrList = " + arrList);
                    arrList.forEach(a-> System.out.println("a = " + a));
                    //list.add();
                }
            }
        }
        System.out.println("count = " + count);

        return list;
    }
}
