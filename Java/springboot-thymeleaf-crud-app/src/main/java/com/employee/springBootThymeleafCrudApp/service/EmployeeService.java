package com.employee.springBootThymeleafCrudApp.service;

import com.employee.springBootThymeleafCrudApp.model.Employee;
import com.employee.springBootThymeleafCrudApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceable {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if(optional.isPresent()){
            employee = optional.get();
        }
        else{
            throw new RuntimeException("Not found by id : "+ id);
        }
        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        if(optional.isPresent()){
            Employee employee = optional.get();
            employeeRepository.delete(employee);
        }
        else{
            throw new RuntimeException("Not found employee : "+ id);
        }
    }
}
