package net.selte.leetcode.controller;

import net.selte.leetcode.problems.leetcode.ReverseString;
import net.selte.leetcode.problems.leetcode.ReverseWords;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

@RestController
public class ReverseController {

    ReverseString reverseString;
    ReverseWords reverseWords;

    public ReverseController(ReverseString reverseString, ReverseWords reverseWords) {
        this.reverseString = reverseString;
        this.reverseWords = reverseWords;
    }

    /**
     * Return reversed value of given String or words
     * <a href="http://localhost:8080/r?s=Mine+Kampf">...</a>
     * return 'eniM fpmaK'
     * <p>
     * //@param s
     *
     * @return String
     */
    @GetMapping("/r")
    public String reverseWords(@RequestParam(value = "s", defaultValue = "World") String s) {
        return reverseWords.reverseWords3(s);
    }

    @GetMapping("/r/{n}")
    public String reverseWordsPathVariable(@PathVariable String n) {
        return reverseWords.reverseWords3(n);
    }

    /**
     * Return reversed value of given String or words
     * <a href="http://localhost:8080/r2?s=I+Love+You">...</a>
     * return 'uoY evoL I'
     * <p>
     * //@param s
     *
     * @return String
     */
    @GetMapping("/r2")
    public String reverseString(@RequestParam(value = "s", defaultValue = "World") String s) {
        char[] charArray = s.toCharArray();
        reverseString.reverseString(charArray);
        return new String(charArray);
    }
}
