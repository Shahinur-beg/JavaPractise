package com.bankdetails.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author BS987
 * created date: 9/27/2022
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDto {
    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("balances")
    private BalanceDto balances;
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

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public BalanceDto getBalances() {
        return balances;
    }

    public void setBalances(BalanceDto balances) {
        this.balances = balances;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
