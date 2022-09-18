package com.api.mysql_api.service;

import com.api.mysql_api.baseResponse.EmployeeResponse;
import com.api.mysql_api.dto.EmployeeAddressDTO;
import com.api.mysql_api.entity.Employee;

import java.util.List;

public interface EmployeeServiceable {
    List<EmployeeAddressDTO> getAllData();
    EmployeeResponse<Employee> setData(Employee employee);
}
