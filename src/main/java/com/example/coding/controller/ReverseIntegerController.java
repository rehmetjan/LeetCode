package com.example.coding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
@Controller
public class ReverseIntegerController {

    @GetMapping("/reverseint")
    public String reverseInteger() {
        return "pages/reverseint";
    }

    @PostMapping("/reverseint")
    public String reverseIntegerPost() {
        return "pages/reverseint";
    }
}
