package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * 编写一个方法，计算从 0 到 n (含 n) 中数字 2 出现的次数。
 * <p>
 * 输入: 25
 * 输出: 9
 * 解释: (2, 12, 20, 21, 22, 23, 24, 25)(注意 22 应该算作两次)
 * n <= 10^9
 */
public class NumberOf2 {
    public static void main(String[] args) {
        int i = numberOf2sInRange(981);
        System.out.printf("there are %d Number of Two in %d %n", i, 981);
        System.out.printf("there are %d Number of Two in %d %n", numberOf2sInRange(25), 25);
        double log = Math.log(25);
        double x = log * log;
        System.out.println("double x = log * log = " + x);
        double log10 = Math.log10(25);
        System.out.println("Math.log(25) = " + log);
        System.out.printf("Math.log10(25) = %.3f%n", log10);
        System.out.println(Math.pow(5, 3));
        System.out.println(Math.log(125));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2, 31));
        double v = Math.log(125) / Math.log(5);
        System.out.println(v);
        System.out.println(Math.log1p(25));
    }

    public static int numberOf2sInRange(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = (int) Math.log10(n) + 1;
        int[][] dp = new int[digit + 1][2];
        // dp[i][0] = numberOf2sInRange(n % pow(10, i)) 保存0~n的1-i位组成的数包含2的个数
        // dp[i][1] = numberOf2sInRange(99..9) 保存i位均为9包含2的个数
        dp[1][0] = n % 10 >= 2 ? 1 : 0;
        dp[1][1] = 1;
        for (int i = 2; i <= digit; i++) {
            int k = n / ((int) Math.pow(10, i - 1)) % 10;
            dp[i][0] = k * dp[i - 1][1] + dp[i - 1][0];
            if (k == 2) {
                dp[i][0] += n % (int) Math.pow(10, i - 1) + 1;
            } else if (k > 2) {
                dp[i][0] += (int) Math.pow(10, i - 1);
            }
            dp[i][1] = 10 * dp[i - 1][1] + (int) Math.pow(10, i - 1); //计算1-i位均为9的值包含2的个数
        }
        return dp[digit][0];
    }
}
