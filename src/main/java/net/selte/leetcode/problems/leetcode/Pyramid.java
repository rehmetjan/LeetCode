package net.selte.leetcode.problems.leetcode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 * I was asked to draw a number triangle using for loop in the interview.
 */
@Slf4j
public class Pyramid {

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid();

        log.info("====== 1st method =====");
        pyramid.makePyramid();
        log.info("====== 2nd method =====");
        pyramid.make2ndPyramid();
        log.info("====== third method =====");
        pyramid.make3rdPyramid();

    }


    /**
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     * 6 6 6 6 6 6
     * 7 7 7 7 7 7 7
     * 8 8 8 8 8 8 8 8
     * 9 9 9 9 9 9 9 9 9
     */
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


    /**
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     */
    private void make2ndPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j > 4 - i; j--) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    /**
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     */
    private void make3rdPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println();
        }
    }
}
