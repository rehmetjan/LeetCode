package net.selte.leetcode.problems.leetcode;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 * <p>
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * <p>
 * 提示：
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 执行用时：0 ms ,   在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.5 MB, 在所有 Java 提交中击败了 51.13% 的用户
 * 通过测试用例：123 / 123
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        String prefix = strings[0];
        int count = strings.length;
        for (int i = 1; i < count; i++) {
            prefix = longestCommonPrefix(prefix, strings[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String longestCommonPrefix(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }
}
