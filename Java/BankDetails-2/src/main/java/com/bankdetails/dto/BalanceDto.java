package com.bankdetails.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author BS987
 * created date: 9/27/2022
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BalanceDto {
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
