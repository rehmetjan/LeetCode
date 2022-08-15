package net.selte.leetcode.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.selte.leetcode.entity.Department;
import net.selte.leetcode.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {
}
