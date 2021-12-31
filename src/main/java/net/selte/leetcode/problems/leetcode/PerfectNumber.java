package net.selte.leetcode.problems.leetcode;

/**
 * @author rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num < 0) {
            return false;
        }
        if (num == 1) {
            return false;
        }

        int sum = 1;
        for (int d = 2; d * d <= num; ++d) {
            if (num % d == 0) {
                sum += d;
                if (d * d < num) {
                    sum += num / d;
                }
            }
        }
        return sum == num;
    }
}
