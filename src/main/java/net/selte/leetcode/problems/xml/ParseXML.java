package net.selte.leetcode.problems.xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Slf4j
public class ParseXML {
    public static void main(String[] args) throws JsonProcessingException {

        String[] names = {"一二三", "一二", "一", "一er三四"};
        String[] result = showNames(names);
        System.out.println(Arrays.toString(result));
    }

    private static String[] showNames(String[] names) {
        String[] result = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            log.info("name: {}, length: {}", names[i], names[i].length());
            StringBuilder n = new StringBuilder();
            log.info("name.length > 2, {}", names[i]);
            char[] chars = names[i].toCharArray();
            char c1 = names[i].charAt(0);
            char c2 = names[i].charAt(names[i].length() - 1);
            log.info(String.valueOf(c1));
            log.info(String.valueOf(c2));
            StringBuilder append = n.append(c1).append("*").append(c2);
            log.info(String.valueOf(append));
            String s = n.toString();
            result[i] = s;

        }
        return result;
    }
}
