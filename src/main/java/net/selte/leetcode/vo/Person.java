package net.selte.leetcode.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Data
public class Person {
    private String name;
    private int age;
    @JsonProperty("birthday")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    private int height;
    private String[] interest;
    private Student students;
}
