package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * <p>
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * Example 1:
 * <p>
 * Input: x = 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: x = -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: x = 120
 * Output: 21
 * Example 4:
 * <p>
 * Input: x = 0
 * Output: 0
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 1、将12345 % 10 得到5，之后将12345 / 10
 * 2、将1234 % 10 得到4，再将1234 / 10
 * 3、将123 % 10 得到3，再将123 / 10
 * 4、将12 % 10 得到2，再将12 / 10
 * 5、将1 % 10 得到1，再将1 / 10
 *
 * 作者：wang_ni_ma
 * 链接：https://leetcode-cn.com/problems/reverse-integer/solution/tu-jie-7-zheng-shu-fan-zhuan-by-wang_ni_ma/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 */

public class ReverseInt {

    public static void main(String[] args) {
        int a = 1928;
        System.out.println(a); // 1928
        System.out.println(a % 10); // 8
        System.out.println(a / 10); // 192

        System.out.println(192 * 10 + 1928 % 10); // 1928
    }

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int num = x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 ||
                    (result == Integer.MIN_VALUE / 10 && num < Integer.MIN_VALUE % 10)) {
                return 0;
            }

            result = result * 10 + num;
        }

        return result;
    }
}
