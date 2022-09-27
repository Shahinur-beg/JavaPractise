package com.bankdetails.entity;

import com.bankdetails.core.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "Account")
public class Account extends BaseEntity{
    @JsonProperty("account_id")
    private String accountId;

    @JsonProperty("balances")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AB_ID")
    private Balance balances;

    @JsonProperty("mask")
    private String mask;
    @JsonProperty("name")
    private String name;
    @JsonProperty("official_name")
    private String officialName;
    @JsonProperty("subtype")
    private String subtype;
    @JsonProperty("type")
    private String type;
}
