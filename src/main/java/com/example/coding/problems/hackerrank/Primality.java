package com.example.coding.problems.hackerrank;

import java.io.IOException;
import java.util.Scanner;


public class Primality {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(scanner.nextBigInteger().isProbablePrime(100) ? "prime" : "not prime");
        }
    }
}
