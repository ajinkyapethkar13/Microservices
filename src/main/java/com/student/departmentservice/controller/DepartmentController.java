package com.student.departmentservice.controller;

import com.student.departmentservice.entity.Department;
import com.student.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(method = RequestMethod.POST,value = "/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("Inside findByIdDepartment method of Department Controller");
        return departmentService.findDepartmentById(departmentId);
    }
}
