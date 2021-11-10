package com.example.coding.controller;

import com.example.coding.greeting.Greeting;
import com.example.coding.problems.leetcode.ReverseInt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        int reverse = reverseInt.reverse(1982);
        model.addAttribute("greeting", new Greeting());
        model.addAttribute("name", name);
        model.addAttribute("reverseNumber", reverse);
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);
        return "result";
    }
}
