package com.example.coding.problems.codewars;

import java.util.Arrays;

public class Positive {
    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(v -> v > 0).sum();
    }

    public static int sum2(int[] arr) {
        int result = 0;
        for (int i : arr) {
            if (i > 0) {
                result += i;
            }
        }
        return result;
    }
}
