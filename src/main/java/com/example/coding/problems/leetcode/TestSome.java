package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

public class TestSome {
    public static void main(String[] args) {

        char[] charArray = "Hello World".toCharArray();
        for (char c : charArray) {
            for (String s : "Hello World".split("")) {
                System.out.println(s + s + c);
            }
        }

    }
}
