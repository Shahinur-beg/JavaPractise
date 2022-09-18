package com.api.mysql_api.dto;

import lombok.Data;

@Data
public class EmployeeAddressDTO {
    private String name;
    private String email;
    private String district;
    private String subDistrict;
}
