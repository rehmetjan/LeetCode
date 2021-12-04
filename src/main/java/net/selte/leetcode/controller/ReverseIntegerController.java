package net.selte.leetcode.controller;

import net.selte.leetcode.problems.leetcode.ReverseInt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class ReverseIntegerController {
    Logger logger = LoggerFactory.getLogger(ReverseIntegerController.class);
    // no need @Autowired here, constructor inject
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
            logger.info(String.valueOf(reverse));
            model.addAttribute("reverse", reverse);
        } catch (Exception e) {
            model.addAttribute("reverse", e.getMessage());
        }
        return "pages/reverseint";
    }
}
