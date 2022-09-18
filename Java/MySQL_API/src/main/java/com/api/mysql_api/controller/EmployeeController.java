package com.api.mysql_api.controller;

import com.api.mysql_api.baseResponse.EmployeeResponse;
import com.api.mysql_api.dto.EmployeeAddressDTO;
import com.api.mysql_api.entity.Employee;
import com.api.mysql_api.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getData")
    private List<EmployeeAddressDTO> getData(){
        return employeeService.getAllData();
    }
    @PostMapping("/setData")
    private EmployeeResponse<Employee> setData(@RequestBody Employee employee){
        System.out.println(employee.getName());
        return employeeService.setData(employee);
    }
}
