package net.selte.leetcode.problems.leetcode;

import lombok.extern.slf4j.Slf4j;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
@Slf4j
public class RotateArray {
    public static void main(String[] args) {
        System.out.println(11 % 7); //4
        System.out.println(46 % 11); //2
        System.out.println(3 % 7); //3
        System.out.println(-3 % 7); //-3
        System.out.println(14 / 5); //2
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] ints = new int[length];

        for (int i = 0; i < length; i++) {
            int ik = i + k;
            int ikl = ik % length;
            log.info("i + k = " + ik + ", i + k % length =" + ikl % length);

            ints[(i + k) % length] = nums[i];
        }

        System.arraycopy(ints, 0, nums, 0, length);
    }
}
