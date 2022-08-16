package net.selte.leetcode.controller;

import lombok.extern.slf4j.Slf4j;
import net.selte.leetcode.entity.Department;
import net.selte.leetcode.service.IDepartmentService;
import net.selte.leetcode.vo.Result;
import org.springframework.web.bind.annotation.*;

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
    }

    @GetMapping("/{id}")
    public Department getOne(@PathVariable String id) {
        Department department = departmentService.getById(id);
        return department;
    }

    @PostMapping("/add")
    public Result<?> add(@RequestBody Department department) {
        departmentService.save(department);
        return Result.ok("Saved");
    }

}
