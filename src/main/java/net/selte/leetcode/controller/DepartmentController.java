package net.selte.leetcode.controller;

import lombok.extern.slf4j.Slf4j;
import net.selte.leetcode.entity.Department;
import net.selte.leetcode.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author rt
 * Copyright (c) 2022 by rt
 * All rights reserved.
 */
@Slf4j
@RestController
@RequestMapping("/dept")
public class DepartmentController {

    private final IDepartmentService departmentService;

    public DepartmentController(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/list")
    public List<Department> list() {
        return departmentService.list();
//        return null;
    }

}
