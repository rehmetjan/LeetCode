package net.selte.leetcode.problems.pdf;


/**
 * @author rt
 * Copyright (c) 2023 by rt
 * All rights reserved.
 */
public class PdfReader {
    public static void main(String[] args) {
        // write a function called maxSubArraySum which accepts an array of integers and a number called n.
        // The function should calculate the maximum sum of n consecutive elements in the array.

        System.out.println(maxSubArraySum(new int[]{1, 2, 5, 2, 8, 1, 5}, 2)); // 10
        System.out.println(maxSubArraySum(new int[]{1, 2, 5, 2, 8, 1, 5}, 4)); // 17
        System.out.println(maxSubArraySum(new int[]{4, 2, 1, 6}, 1)); // 6
        System.out.println(maxSubArraySum(new int[]{4, 2, 1, 6, 2}, 4)); // 13


    }

    /**
     * @param arr array of integers
     * @param n   number of consecutive elements
     * @return max sum of n consecutive elements
     */
    public static int maxSubArraySum(int[] arr, int n) {
        // maxSubArraySum which accepts an array of integers and a number called n.
        // The function should calculate the maximum sum of n consecutive elements in the array.
        // [1,2,5,2,8,1,5], 2


        // 1. create a temp variable to store the sum of the first n elements
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // 2. create a max variable to store the max sum of n elements
        int max = sum;

        // 3. loop through the array starting from the n element
        for (int i = n; i < arr.length; i++) {
            // 4. subtract the first element of the n elements and add the next element
            sum = sum - arr[i - n] + arr[i];
            // 5. compare the temp variable with the max variable and store the max value in the max variable
            max = Math.max(max, sum);
        }

        // 4. subtract the first element of the n elements and add the next element
        // 5. compare the temp variable with the max variable and store the max value in the max variable
        // 6. return the max variable

        return max;

    }
}
