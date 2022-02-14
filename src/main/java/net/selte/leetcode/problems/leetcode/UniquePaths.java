package net.selte.leetcode.problems.leetcode;

import java.util.Arrays;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
//        System.out.println("f[i][0]");
        for (int i = 0; i < m; ++i) {
            f[i][0] = 1;
//            System.out.println(Arrays.deepToString(f));
        }
//        System.out.println("f[0][j]");
        for (int j = 0; j < n; ++j) {
            f[0][j] = 1;
//            System.out.println(Arrays.deepToString(f));
        }
//        System.out.println("f[i][j]");
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                f[i][j] = f[i - 1][j] + f[i][j - 1];
                System.out.println(Arrays.deepToString(f));
            }
        }
        return f[m - 1][n - 1];
    }

    public int uniquePaths2(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; ++x, ++y) {
            ans = ans * x / y;
        }
        return (int) ans;
    }
}
