package com.employee.springBootThymeleafCrudApp.service;

import com.employee.springBootThymeleafCrudApp.model.Employee;

import java.util.List;

public interface EmployeeServiceable {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(int id);
    void deleteEmployee(int id);
}
