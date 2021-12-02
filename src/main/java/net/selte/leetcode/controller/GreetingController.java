package net.selte.leetcode.controller;

import net.selte.leetcode.greeting.Greeting;
import net.selte.leetcode.problems.leetcode.ReverseInt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

@Controller
public class GreetingController {

    ReverseInt reverseInt;

    public GreetingController(ReverseInt reverseInt) {
        this.reverseInt = reverseInt;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "LeetCode") String name, Model model) {
        int reverse = reverseInt.reverse(1982);
        model.addAttribute("greeting", new Greeting());
        model.addAttribute("date", new Date());
        model.addAttribute("name", name);
        model.addAttribute("reverseNumber", reverse);
        return "pages/greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "pages/result";
    }
}
