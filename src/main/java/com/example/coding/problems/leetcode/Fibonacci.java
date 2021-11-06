package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class Fibonacci {
    public int fib(int n) {

        if (n == 0 || n == 1) {
            return 0;
        }

        int prev;
        prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }

        return curr;
    }
}
