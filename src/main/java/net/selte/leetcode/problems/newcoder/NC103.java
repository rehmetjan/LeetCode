package net.selte.leetcode.problems.newcoder;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class NC103 {
    public static String solve(String str) {
        char[] ans = str.toCharArray();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            ans[i] = str.charAt(length - 1 - i);
        }
        return new String(ans);
    }

    public static String solve2(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
