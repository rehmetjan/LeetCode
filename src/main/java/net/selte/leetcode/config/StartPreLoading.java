package net.selte.leetcode.config;

import lombok.extern.slf4j.Slf4j;
import net.selte.leetcode.entity.Video;
import net.selte.leetcode.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
        for (int i = 0; i < 10; i++) {
            Video video = new Video();
            video.setName("Video " + i);
            video.setSeconds(900L);
            log.info(video.getName());
        }

    }
}
