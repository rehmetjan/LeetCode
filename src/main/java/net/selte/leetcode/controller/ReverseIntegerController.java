package net.selte.leetcode.controller;

import lombok.extern.slf4j.Slf4j;
import net.selte.leetcode.problems.leetcode.ReverseInt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */

@Controller
@Slf4j
public class ReverseIntegerController {

    ReverseInt reverseInt;

    public ReverseIntegerController(ReverseInt reverseInt) {
        this.reverseInt = reverseInt;
    }

    @GetMapping("/reverseint")
    public String reverseInteger() {
        return "pages/reverseint";
    }

    @PostMapping(value = "/reverseint")
    public String reverseIntegerPost(@RequestBody String params, Model model) {
        try {
            int number = Integer.parseInt(params.split("=")[1]);
            int reverse = reverseInt.reverse(number);
            log.info(String.valueOf(reverse));
            model.addAttribute("reverse", reverse);
        } catch (Exception e) {
            model.addAttribute("reverse", e.getMessage());
        }
        return "pages/reverseint";
    }
}
