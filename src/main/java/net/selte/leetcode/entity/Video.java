package net.selte.leetcode.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Data
@TableName("video")
public class Video {
 private Long id;
 private String name;
 private Long seconds;
}
