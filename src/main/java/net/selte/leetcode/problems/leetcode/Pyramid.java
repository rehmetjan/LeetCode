package net.selte.leetcode.problems.leetcode;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 * I was asked to draw a number triangle using for loop in the interview.
 */
public class Pyramid {

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();
        pyramid.makePyramid();
    }

    public void makePyramid() {
        int i;
        int j;
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9 - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < i; j++) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
