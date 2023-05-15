package net.selte.leetcode.algorithm.day03;

import com.google.common.collect.ImmutableSet;

/**
 * @author rt
 * Copyright (c) 2023 by rt
 * All rights reserved.
 */
public class GuavaLesson {


	public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
			"red",
			"orange",
			"yellow",
			"green",
			"blue",
			"purple");

	public static void main(String[] args) {
		COLOR_NAMES.stream().iterator().forEachRemaining(System.out::println);
	}

}
