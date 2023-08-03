package net.selte.leetcode.greeting;

import lombok.Data;

/**
 * @author rt
 * Copyright (c) 2023 by rt
 * All rights reserved.
 */
@Data
public class Greet {
	private String message;
	private String name;
	private String greeting;

	public Greet(String message, String name) {
		this.message = message;
		this.name = name;
		this.greeting = message + " " + name;
	}
}
