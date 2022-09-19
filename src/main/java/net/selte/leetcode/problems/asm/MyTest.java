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
        if (a.equals(simon)) System.out.println("==");
        for (char c : simon.toCharArray()) {
            System.out.println(c);
        }

        String charles = myTest.myName("Charles");
        System.out.println("charles = " + charles);
        System.out.println("myName() = " + myTest.myName("Richard"));
    }

    private String myName(String name) {
        System.out.println("name = " + name);
        return "Mr." + name;
    }

    private String simon() {
        return "Simon";
    }
}
