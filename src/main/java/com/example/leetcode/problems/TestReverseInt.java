package com.example.leetcode.problems;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class TestReverseInt {
    public static void main(String[] args) {
        int x = 123;
        int num = x % 10;
        System.out.println("num = x % 10; num = " + num);

        x /= 10;
        System.out.println("now x = " + x);

        int result;
        result = num;
        System.out.println(result);

        ReverseInt reverseInt = new ReverseInt();
        int reverse = reverseInt.reverse(12);
        System.out.println(reverse);



    }
}
