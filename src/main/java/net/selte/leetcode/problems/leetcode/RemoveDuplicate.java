package net.selte.leetcode.problems.leetcode;

import java.util.Arrays;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        // [4,1,2,1,2]
        int b = 7;
        int c = 13;
        int bc = b ^ c;

        System.out.println(b + " ^ " + c + " = " + bc);

    }

    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }
        return ++left;
    }
}
