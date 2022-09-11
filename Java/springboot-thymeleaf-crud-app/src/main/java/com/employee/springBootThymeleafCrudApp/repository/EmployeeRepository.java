package com.employee.springBootThymeleafCrudApp.repository;

import com.employee.springBootThymeleafCrudApp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
