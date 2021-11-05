package com.example.leetcode.codewars;

import java.util.ArrayList;
import java.util.List;

/**
 * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
 * Write a function which takes a list of strings and returns each line prepended by the correct number.
 * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
 * <p>
 * Examples:
 * <p>
 * number(Arrays.asList()) # => []
 * number(Arrays.asList("a", "b", "c")) // => ["1: a", "2: b", "3: c"]
 */
public class LineNumbering {

    public static List<String> number(List<String> lines) {

        List<String> format = new ArrayList<>(lines.size());
        for (int i = 0; i < lines.size(); i++) {
            format.add(String.format("%d: %s", i + 1, lines.get(i)));
        }

        return format;
    }
}
