package com.example.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * 夏日炎炎，小男孩 Tony 想买一些雪糕消消暑。
 * <p>
 * 商店中新到 n 支雪糕，
 * 用长度为 n 的数组 costs 表示雪糕的定价，其中 costs[i] 表示第 i 支雪糕的现金价格。
 * Tony 一共有 coins 现金可以用于消费，他想要买尽可能多的雪糕。
 * <p>
 * 给你价格数组 costs 和现金量 coins ，
 * 请你计算并返回 Tony 用 coins 现金能够买到的雪糕的 最大数量 。
 * <p>
 * 注意：Tony 可以按任意顺序购买雪糕。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-ice-cream-bars
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class MaxIceCreamTest {

    @Test
    public void test1() {
        MaxIceCream maxIceCream = new MaxIceCream();
        int[] costs = new int[]{1, 3, 2, 4, 1};
        int result = maxIceCream.maxIceCream(costs, 7);
        assertEquals(4, result);
    }

    @Test
    public void test2() {
        MaxIceCream maxIceCream = new MaxIceCream();
        int[] costs = new int[]{10, 6, 8, 7, 7, 8};
        int result = maxIceCream.maxIceCream(costs, 5);
        assertEquals(0, result);
    }

    @Test
    public void test3() {
        MaxIceCream maxIceCream = new MaxIceCream();
        int[] costs = new int[]{1, 6, 3, 1, 2, 5};
        int coins = 7;
        int result = maxIceCream.maxIceCream(costs, 20);
        assertEquals(6, result);
    }
}
