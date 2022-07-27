package net.selte.leetcode;

import net.selte.leetcode.entity.Video;
import net.selte.leetcode.mapper.VideoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@SpringBootTest
public class MyBatisPlusTest {

    @Autowired
    VideoMapper videoMapper;

    @Test
    public void testSelectList() {
        List<Video> videos = videoMapper.selectList(null);
        videos.forEach(System.out::println);
    }
}
