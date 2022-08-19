package net.selte.leetcode.problems.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(bufferedReader.readLine().trim());

        int result = Result.isPrime(n);
        System.out.println(result);

    }
}


class Result {

    /*
     * Complete the 'isPrime' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static int isPrime(long n) {
        // Write your code here
        List<Integer> list = new ArrayList<>();

//        let isPrime = function (number) {
//            let input = number,
//            divisors = [];
//
//            for (let i=2; i<=input/2; i++) {
//                if (input % i === 0) {
//                    divisors.push(i);
//                }
//            }
//            return divisors.length ? divisors [0] : 1;
//        }

        for (int i = 2; i <= n /2; i++) {
            if (n%i==0) {
                list.add(i);
            }
        }
        return !list.isEmpty()?Collections.min(list):1;
//        return Collections.min(list);
    }

}

