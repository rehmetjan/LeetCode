package com.example.coding.guava.string;

import com.google.common.base.Splitter;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * author: rt
 * Copyright (c) 2021 by rt
 * All rights reserved.
 */
public class SplitterTest {

    @Test
    public void testSplitter() {
        List<String> stringList = Splitter.on(".").splitToList("net.selte.base");
        for (String s : stringList) {
            System.out.println(s);
        }

        assertEquals("net", stringList.get(0));
    }
}
