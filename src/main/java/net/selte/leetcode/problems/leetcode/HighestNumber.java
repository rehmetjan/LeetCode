package net.selte.leetcode.problems.leetcode;

import java.util.Arrays;


/**
 * @author rt
 * Copyright (c) 2023 by rt
 * All rights reserved.
 */


public class HighestNumber {
	public static String highestNumber(int[] ints) {
		// Convert integers to strings
		String[] strArr = new String[ints.length];
		for (int i = 0; i < ints.length; i++) {
			strArr[i] = String.valueOf(ints[i]);
		}

		// Sort the strings in descending order based on custom comparator
		Arrays.sort(strArr, (a, b) -> {
			String order1 = a + b;
			String order2 = b + a;
			return order2.compareTo(order1);
		});

		// Concatenate the sorted strings to form the highest number
		StringBuilder result = new StringBuilder();
		for (String str : strArr) {
			result.append(str);
		}

		// Handle case where the array consists of only zeros
		if (result.toString().matches("0+")) {
			return "0";
		}

		return result.toString();
	}

	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		System.out.println(highestNumber(numbers)); // should return "9534330"
	}
}
