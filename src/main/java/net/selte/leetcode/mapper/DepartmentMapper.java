package net.selte.leetcode.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.selte.leetcode.entity.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
}
