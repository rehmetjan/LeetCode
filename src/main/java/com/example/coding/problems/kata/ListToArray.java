package com.example.coding.problems.kata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list); // [a,b,c]

        String[] array = new String[list.size()];
        array = list.toArray(array);
        System.out.println(Arrays.toString(array)); // [a,b,c]
    }
}
