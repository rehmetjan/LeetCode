package net.selte.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.selte.leetcode.entity.Video;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
//@Repository
@Mapper
public interface VideoMapper extends BaseMapper<Video> {
}
