package net.selte.leetcode.problems.kata;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class MultiplyOf9 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " x " + j + " = " + i * j);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
