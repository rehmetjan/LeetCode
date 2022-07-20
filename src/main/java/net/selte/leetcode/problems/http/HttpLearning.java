package net.selte.leetcode.problems.http;

import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
public class HttpLearning {

    static RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) throws IOException {

        String forObject = restTemplate.getForObject("https://www.baidu.com", String.class);
        System.out.println(forObject);

    }
}
