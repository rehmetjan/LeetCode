package com.example.coding.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * 给定一个字符串数组words，请计算当两个字符串 words[i] 和 words[j] 不包含相同字符时，
 * 它们长度的乘积的最大值。假设字符串中只包含英语的小写字母。
 * 如果没有不包含相同字符的一对字符串，返回 0。
 * <p>
 * 2 <= words.length <= 1000
 * 1 <= words[i].length <= 1000
 * words[i] 仅包含小写字母
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/aseY1I
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MaxProduct {
    public int maxProduct(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            String word1 = words[i];
            for (int j = i + 1; j < words.length; j++) {
                String word2 = words[j];
                if (!hasSameChar(word1, word2)) {
                    ans = Math.max(ans, word1.length() * word2.length());
                }
            }
        }
        return ans;
    }

    private boolean hasSameChar(String word1, String word2) {
        int bitMask1 = 0, bitMask2 = 0;
        for (char c : word1.toCharArray()) bitMask1 |= (1 << (c - 'a'));
        for (char c : word2.toCharArray()) bitMask2 |= (1 << (c - 'a'));
        return (bitMask1 & bitMask2) != 0;
    }

    private boolean hasSameChar1(String word1, String word2) {
        for (char c : word1.toCharArray()) {
            if (word2.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    private boolean hasSameChar2(String word1, String word2) {
        int[] count = new int[26];
        for (char c : word1.toCharArray()) {
            count[c - 'a'] = 1;
        }
        for (char c : word2.toCharArray()) {
            if (count[c-'a']==1) {
                return true;
            }
        }
        return false;
    }
}
