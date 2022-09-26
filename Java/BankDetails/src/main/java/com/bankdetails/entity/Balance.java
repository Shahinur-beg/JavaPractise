package com.bankdetails.entity;

import com.bankdetails.core.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Balance extends BaseEntity {
    private String available;
    private String current;
    private String limit;
    private String isoCurrencyCode;
    private String unofficialCurrencyCode;
    private String lastUpdatedDatetime;
}
