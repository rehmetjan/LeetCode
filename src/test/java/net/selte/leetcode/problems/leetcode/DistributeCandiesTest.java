package net.selte.leetcode.problems.leetcode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

class DistributeCandiesTest {

    Logger logger = LoggerFactory.getLogger(DistributeCandiesTest.class);

    @Test
    public void test1() {
        DistributeCandies distributeCandies = new DistributeCandies();
        int[] candyType = {1, 1, 2, 2, 3, 3};
        int candies = distributeCandies.distributeCandies(candyType);
        logger.info("Actual candies " + candies);
        assertEquals(3, candies);
    }

    @Test
    public void test2() {
        DistributeCandies distributeCandies = new DistributeCandies();
        int[] candyType = {1, 1, 2, 3};
        int candies = distributeCandies.distributeCandies(candyType);
        logger.info("Actual candies " + candies);
        assertEquals(2, candies);
    }

    @Test
    public void test3() {
        DistributeCandies distributeCandies = new DistributeCandies();
        int[] candyType = {6, 6, 6, 6};
        int candies = distributeCandies.distributeCandies(candyType);
        logger.info("Actual candies " + candies);
        assertEquals(1, candies);
    }

}
