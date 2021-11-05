package com.example.leetcode.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

public class DistributeCandies {

    Logger logger = LoggerFactory.getLogger(DistributeCandies.class);

    public int distributeCandies(int[] candyType) {
        logger.info("Given: " + Arrays.toString(candyType)
                + " Length: " + candyType.length);
        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        int getHalf = candyType.length / 2;
        logger.info("(candyType.length) " + candyType.length + " / 2 = " + getHalf);
        logger.info("Now the set is: " + set);
        System.out.println("------------End------------");
        return Math.min(set.size(), getHalf);
    }
}
