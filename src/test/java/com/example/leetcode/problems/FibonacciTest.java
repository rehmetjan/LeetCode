package com.example.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class FibonacciTest {

    @Test
    public void test1() {
        Fibonacci fibonacci = new Fibonacci();
        int fib = fibonacci.fib(2);
        assertEquals(1, fib);
    }
    @Test
    public void test2() {
        Fibonacci fibonacci = new Fibonacci();
        int fib = fibonacci.fib(3);
        assertEquals(2, fib);
    }
    @Test
    public void test3() {
        Fibonacci fibonacci = new Fibonacci();
        int fib = fibonacci.fib(4);
        assertEquals(3, fib);
    }

}
