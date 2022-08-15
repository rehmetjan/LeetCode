package net.selte.leetcode.problems.http;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Slf4j
public class HttpLearning {

    static RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) throws IOException {

        String forObject = restTemplate.getForObject("https://www.baidu.com", String.class);
        System.out.println(forObject);

        Document doc = Jsoup.connect("https://jsoup.org/").get();
        log.info(doc.title());
        log.info(doc.html());

        Elements newsHeadLines = doc.select("n1-home wrap header nav-sections ul li a");


        for (Element headLine : newsHeadLines) {
            log.info(headLine.text());
        }


    }
}
