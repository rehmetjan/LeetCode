package com.example.coding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
@Controller
public class PalindromeController {
    @GetMapping("/palindrome")
    public String palindrome() {
        return "pages/palindrome";
    }
}
