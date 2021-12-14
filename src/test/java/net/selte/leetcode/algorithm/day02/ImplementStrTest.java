package net.selte.leetcode.algorithm.day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * 实现 strStr() 函数。
 * <p>
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。
 * 如果不存在，则返回  -1 。
 * <p>
 * <p>
 * <p>
 * 说明：
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。
 * 这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：haystack = "hello", needle = "ll"
 * 输出：2
 * 示例 2：
 * <p>
 * 输入：haystack = "aaaaa", needle = "bba"
 * 输出：-1
 * 示例 3：
 * <p>
 * 输入：haystack = "", needle = ""
 * 输出：0
 * <p>
 * <p>
 * 提示：
 * <p>
 * 0 <= haystack.length, needle.length <= 5 * 10^4
 * haystack 和 needle 仅由小写英文字符组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class ImplementStrTest {
    ImplementStr implementStr = new ImplementStr();

    @Test
    public void test1() {
        String hayStack = "hello";
        String needle = "ll";
        assertEquals(2, implementStr.strStr(hayStack, needle));
    }

    @Test
    public void test2() {
        String hayStack = "aaaaa";
        String needle = "bba";
        assertEquals(-1, implementStr.strStr(hayStack, needle));
    }

    @Test
    public void test3() {
        String hayStack = "";
        String needle = "";
        assertEquals(0, implementStr.strStr(hayStack, needle));
    }


}
