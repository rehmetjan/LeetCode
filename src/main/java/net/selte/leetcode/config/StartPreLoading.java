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
@Order(1)
public class StartPreLoading implements CommandLineRunner {
    @Override
    public void run(String... args) {
        log.info("StartPreLoading ...");
    }
}
