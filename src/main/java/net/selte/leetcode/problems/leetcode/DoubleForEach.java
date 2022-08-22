package net.selte.leetcode.problems.leetcode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Slf4j
public class DoubleForEach {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            log.info("外层循环第" + i + '次');
            for (int j = 1; j <= 3; j++) {
                log.info("  里层循环第" + j + '次');
            }
        }
    }
}
