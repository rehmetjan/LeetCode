package net.selte.leetcode.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class MathMax {
    public static void main(String[] args) {
        MathMax mathMax = new MathMax();
        System.out.println(mathMax.max(2, 5));
        System.out.println(mathMax.max(6, 6));
        System.out.println(mathMax.max(-6, -96));
    }

    public int max(int i1, int i2) {
        if (i1 > i2) {
            return i1;
        } else if (i1 < i2) {
            return i2;
        }
        return 0;
    }
}
