package com.example.leetcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * 示例 1:
 *
 * 输入: words = ["abcw","baz","foo","bar","fxyz","abcdef"]
 * 输出: 16
 * 解释: 这两个单词为 "abcw", "fxyz"。它们不包含相同字符，且长度的乘积最大。
 * 示例 2:
 *
 * 输入: words = ["a","ab","abc","d","cd","bcd","abcd"]
 * 输出: 4
 * 解释: 这两个单词为 "ab", "cd"。
 * 示例 3:
 *
 * 输入: words = ["a","aa","aaa","aaaa"]
 * 输出: 0
 * 解释: 不存在这样的两个单词。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/aseY1I
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
class MaxProductTest {
    @Test
    public void test1() {
        MaxProduct maxProduct = new MaxProduct();
        String[] words = new String[]{"abcw", "baz", "foo", "bar", "fxyz", "abcdef"};
        int result = maxProduct.maxProduct(words);
        assertEquals(16, result);
    }

    @Test
    public void test2() {
        MaxProduct maxProduct = new MaxProduct();
        String[] words = new String[]{"a","ab","abc","d","cd","bcd","abcd"};
        int result = maxProduct.maxProduct(words);
        assertEquals(4, result);
    }

    @Test
    public void test3() {
        MaxProduct maxProduct = new MaxProduct();
        String[] words = new String[]{"a","aa","aaa","aaaa"};
        int result = maxProduct.maxProduct(words);
        assertEquals(0, result);
    }

}
