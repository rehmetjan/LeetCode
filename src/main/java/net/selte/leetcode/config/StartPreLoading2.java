package net.selte.leetcode.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Slf4j
@Component
@Order(2)
public class StartPreLoading2 implements CommandLineRunner {
    @Override
    public void run(String... args) {
        log.info("StartPreLoading2 ...");
    }
}
