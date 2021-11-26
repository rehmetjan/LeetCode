package com.example.coding.problems.leetcode;

import org.springframework.stereotype.Component;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * 思路与算法
 * <p>
 * 对于长度为 N 的待被反转的字符数组，我们可以观察反转前后下标的变化，假设反转前字符数组为 s[0] s[1] s[2] ... s[N - 1]，那么反转后字符数组为 s[N - 1] s[N - 2] ... s[0]。比较反转前后下标变化很容易得出 s[i] 的字符与 s[N - 1 - i] 的字符发生了交换的规律，因此我们可以得出如下双指针的解法：
 * <p>
 * 将 left 指向字符数组首元素，right 指向字符数组尾元素。
 * 当 left < right：
 * 交换 s[left] 和 s[right]；
 * left 指针右移一位，即 left = left + 1；
 * right 指针左移一位，即 right = right - 1。
 * 当 left >= right，反转结束，返回字符数组即可。
 * <p>
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/reverse-string/solution/fan-zhuan-zi-fu-chuan-by-leetcode-solution/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */

@Component
public class ReverseString {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] charArray = "Hello".toCharArray();
        reverseString.reverseString(charArray);
        System.out.println(charArray);
    }

    public void reverseString(char[] s) {
        char temp;
        for (int left = 0, right = s.length - 1; left < right; ++left, --right) { // left++, right--
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
