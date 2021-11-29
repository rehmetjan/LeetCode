package com.example.coding.problems.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1：
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * <p>
 * 示例2：
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * <p>
 * 示例 3：
 * 输入：digits = [0]
 * 输出：[1]
 * <p>
 * 提示：
 * <p>
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class PlusOneTest {
    PlusOne plusOne = new PlusOne();

    @Test
    void test1() {
        int[] digits = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 4};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(digits));
    }

    @Test
    void test2() {
        int[] digits = new int[]{4, 3, 2, 1};
        int[] expected = new int[]{4, 3, 2, 2};
        Assertions.assertArrayEquals(expected, plusOne.plusOne(digits));
    }

}
