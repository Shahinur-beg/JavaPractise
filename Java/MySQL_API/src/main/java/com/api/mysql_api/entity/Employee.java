package com.api.mysql_api.entity;

import com.api.mysql_api.core.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee extends BaseEntity {
    @Column(name = "e_name")
    private String name;
    private String email;
    private int age;
    private Address address;
}
