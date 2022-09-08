package net.selte.leetcode.problems.asm;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class MyTest {
    public static void main(String[] args) {
        String a = "Simon";
        MyTest myTest = new MyTest();
        String simon = myTest.simon();
        if (simon.equals(a)) System.out.println("EQUALS");
        if (simon == a) System.out.println("==");
        for (char c : simon.toCharArray()) {
            System.out.println(c);
        }
    }

    private String simon() {
        return "Simon";
    }
}
