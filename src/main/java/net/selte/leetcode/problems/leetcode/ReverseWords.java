package net.selte.leetcode.problems.leetcode;

import org.springframework.stereotype.Component;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * <p>
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 *  
 * <p>
 * 提示：
 * <p>
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

@Component
public class ReverseWords {

    public static void main(String[] args) {
        ReverseWords reverseWords = new ReverseWords();
        String i_am_hero = reverseWords.reverseWords("I am Hero");
        String i_am_hero2 = reverseWords.reverseWords2("I am Hero");
        System.out.println(i_am_hero);
        System.out.println(i_am_hero2);
    }

    public String reverseWords(String s) {
        StringBuilder ret = new StringBuilder();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                ret.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                ret.append(' ');
            }
        }
        return ret.toString();
    }

    public String reverseWords2(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            arr[i] = sb.reverse().toString();
        }
        return String.join(" ", arr);
    }

    public String reverseWords3(String s) {
        char[] array = s.toCharArray();
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                reverse(array, start, i - 1);
//                start = i +=1; // start = ++i; // 更新start为下一个单词的左索引
                start = i + 1; // 更新start为下一个单词的左索引
                continue;
            }
            if (i == array.length - 1) {
                reverse(array, start, i);
            }
        }
        return new String(array);
    }

    private void reverse(char[] array, int l, int r) {
        while (l < r) {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++; // l = l + 1; l += 1;
            r--; // r = r - 1; r -= 1;
        }
    }
}
