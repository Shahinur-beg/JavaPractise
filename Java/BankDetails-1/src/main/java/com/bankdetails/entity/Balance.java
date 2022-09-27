package com.bankdetails.entity;

import com.bankdetails.core.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "accountBalance")
public class Balance extends BaseEntity {
    @JsonProperty("available")
    private String available;
    @JsonProperty("current")
    private Double current;
    @JsonProperty("iso_currency_code")
    private String isoCurrencyCode;
    @JsonProperty("limit")
    private String limit;
    @JsonProperty("unofficial_currency_code")
    private String unofficialCurrencyCode;
}
