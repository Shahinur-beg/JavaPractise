package com.bankdetails.entity;

import com.bankdetails.core.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "Balance")
public class Balance extends BaseEntity{
    private String available;
    private Double current;
    private String isoCurrencyCode;
    private String limit;
    private String unofficialCurrencyCode;

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Double getCurrent() {
        return current;
    }

    public void setCurrent(Double current) {
        this.current = current;
    }

    public String getIsoCurrencyCode() {
        return isoCurrencyCode;
    }

    public void setIsoCurrencyCode(String isoCurrencyCode) {
        this.isoCurrencyCode = isoCurrencyCode;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getUnofficialCurrencyCode() {
        return unofficialCurrencyCode;
    }

    public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
        this.unofficialCurrencyCode = unofficialCurrencyCode;
    }
}
