package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
class GenerateParenthesesTest {

    @Test
    public void test1() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        List<String> strings = generateParentheses.generateParenthesis(3);
        List<String> list = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(list, strings);
    }

}
