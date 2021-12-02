package net.selte.leetcode.problems.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

public class IntArrayToList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        System.out.println(Arrays.toString(array)); //[1, 2, 3, 5]


        List<Integer> list = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list); //[1, 2, 3, 5]
    }
}
