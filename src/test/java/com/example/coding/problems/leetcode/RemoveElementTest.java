package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {

    final RemoveElement removeElement = new RemoveElement();

    @Test
    void test1() {
        int result = removeElement.removeElement(new int[]{1, 2, 3, 4}, 3);
        assertEquals(3, result);
    }

    @Test
    void test2() {
        int result = removeElement.removeElement(new int[]{3, 2, 2, 3}, 3);
        assertEquals(2, result);
    }

}
