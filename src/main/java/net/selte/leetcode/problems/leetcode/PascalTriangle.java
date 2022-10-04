package net.selte.leetcode.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class PascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> pt = generate(6);
        for (int i = 0; i < pt.size(); i++) {
            printSpace(pt.size() - i);
            System.out.println(pt.get(i));
        }
    }

    public static void printSpace(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}
