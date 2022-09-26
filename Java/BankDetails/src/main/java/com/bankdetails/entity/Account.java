package com.bankdetails.entity;

import com.bankdetails.core.BaseEntity;
import com.plaid.client.model.AccountBase;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseEntity{
    private String accountId;
    private Balance balance;
    private String mask;
    private String name;
    private String officialName;
    private String type;
    private String subtype;
    private String verificationStatus;
}
