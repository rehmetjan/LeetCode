package com.example.coding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "index";
    }
}
