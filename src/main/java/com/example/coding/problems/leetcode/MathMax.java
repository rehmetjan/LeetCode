package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class MathMax {
    public int max(int i1, int i2) {
        if (i1 > i2) {
            return i1;
        } else if(i1 < i2) {
            return i2;
        }
        return 0;
    }
}
