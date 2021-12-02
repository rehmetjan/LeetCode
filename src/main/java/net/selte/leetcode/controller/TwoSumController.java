package net.selte.leetcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
@Controller
public class TwoSumController {
    @GetMapping("/twosum")
    public String twoSum() {
        return "pages/twosum";
    }
}
