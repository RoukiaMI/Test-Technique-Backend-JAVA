package com.rest.testTechnique.controller;


import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.testTechnique.modele.Employee;
import com.rest.testTechnique.service.EmployeeService;

import lombok.AllArgsConstructor;
@RestController
@RequestMapping("/api/v1/Employe")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService serviceEmployee;

    @PostMapping("/create")
    public Employee creer(@RequestBody Employee p){
        return serviceEmployee.creer(p);
    }
}
