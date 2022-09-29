package com.bankdetails.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BS987
 * created date: 9/27/2022
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerDto {
    @JsonProperty("accounts")
    private List<AccountDto> accounts = new ArrayList<>();
    @JsonProperty("item")
    private ItemDto item;
    @JsonProperty("request_id")
    private String requestId;

    public List<AccountDto> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountDto> accounts) {
        this.accounts = accounts;
    }

    public ItemDto getItem() {
        return item;
    }

    public void setItem(ItemDto item) {
        this.item = item;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
