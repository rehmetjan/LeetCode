package net.selte.leetcode.problems.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class FizzBuzz {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        FizzBuzz.fizzBuzz(n);

        bufferedReader.close();
    }

    public static void fizzBuzz(int n) {
        // Write your code here
        List<String> answer = new ArrayList<>();

        for (int num = 1; num <= n; num++) {
            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);

            if(divisibleBy3 && divisibleBy5) {
                answer.add("FizzBuzz");
                System.out.println("FizzBuzz");
            }
            else if (divisibleBy3) {
                answer.add("Fizz");
                System.out.println("Fizz");
            }
            else if (divisibleBy5) {
                answer.add("Buzz");
                System.out.println("Buzz");
            }
            else {
                answer.add(Integer.toString(num));
                System.out.println(num);
            }
        }
    }
}
