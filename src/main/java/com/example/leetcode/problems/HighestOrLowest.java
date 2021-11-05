package com.example.leetcode.problems;

import java.util.Arrays;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class HighestOrLowest {

    public static String highAndLow(String numbers) {
        String[] strArray = numbers.split(" ");
        int intArray_size = strArray.length;
        int[] intArray = new int[intArray_size];

        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        int highest = intArray[0];
        int lowest = intArray[0];

        for (int j = 1; j < intArray.length; j++) {
            if (intArray[j] > highest) {
                highest = intArray[j];
            }
            if (intArray[j] < lowest) {
                lowest = intArray[j];
            }
        }

        return String.format("%d %d", highest, lowest);
    }

    public static String HighAndLow(String numbers) {


        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .min()
                .orElse(0);

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .max()
                .orElse(0);

        return String.format("%d %d", max, min);
    }
}
