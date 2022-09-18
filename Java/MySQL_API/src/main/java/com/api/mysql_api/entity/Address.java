package com.api.mysql_api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String district;
    private String subDistrict;
    private String postOffice;
}
