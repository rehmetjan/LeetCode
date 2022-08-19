package net.selte.leetcode.problems.hackerrank;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class BalancingParenthesis {

    public static int getMin(String s) {

        int bal = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); ++i) {
            bal += s.charAt(i) == '(' ? 1 : -1;
            if (bal == -1) {
                ans += 1;
                bal += 1;
            }
        }

        return bal + ans;
    }

}
