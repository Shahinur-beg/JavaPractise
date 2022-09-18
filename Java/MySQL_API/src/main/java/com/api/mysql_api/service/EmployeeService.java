package com.api.mysql_api.service;

import com.api.mysql_api.baseResponse.EmployeeResponse;
import com.api.mysql_api.dto.EmployeeAddressDTO;
import com.api.mysql_api.entity.Employee;
import com.api.mysql_api.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements EmployeeServiceable {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private EmployeeResponse<Employee> employeeResponse;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public List<EmployeeAddressDTO> getAllData(){
        return employeeRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    @Override
    public EmployeeResponse<Employee> setData(Employee employee) {
        try {
            employeeRepository.save(employee);
            employeeResponse.setData(employee);
            employeeResponse.setStatusCode(200);
            employeeResponse.setStatusMessage("Successful!!!");
            return employeeResponse;

        }catch (Exception e){
            employeeResponse.setData(null);
            employeeResponse.setStatusMessage(e.getMessage());
            employeeResponse.setStatusCode(404);
            return employeeResponse;
        }
    }

    private EmployeeAddressDTO convertEntityToDto(Employee employee){
        EmployeeAddressDTO employeeAddressDTO = this.modelMapper.map(employee,EmployeeAddressDTO.class);
        modelMapper.map(employee.getAddress(),employeeAddressDTO);
        return employeeAddressDTO;
    }
    private Employee convertDtoToEntity(EmployeeAddressDTO employeeAddressDTO){
        return this.modelMapper.map(employeeAddressDTO,Employee.class);
    }

}
