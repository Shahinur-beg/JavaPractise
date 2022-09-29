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
public class ItemDto {
    @JsonProperty("available_products")
    private List<String> availableProducts = new ArrayList<>();
    @JsonProperty("billed_products")
    private List<String> billedProducts = new ArrayList<>();
    @JsonProperty("consent_expiration_time")
    private String consentExpirationTime;
    @JsonProperty("error")
    private String error;
    @JsonProperty("institution_id")
    private String institutionId;
    @JsonProperty("item_id")
    private String itemId;
    @JsonProperty("optional_products")
    private String optionalProducts;
    @JsonProperty("products")
    private List<String> products = new ArrayList<>();
    @JsonProperty("update_type")
    private String updateType;
    @JsonProperty("webhook")
    private String webhook;

    public List<String> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(List<String> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public List<String> getBilledProducts() {
        return billedProducts;
    }

    public void setBilledProducts(List<String> billedProducts) {
        this.billedProducts = billedProducts;
    }

    public String getConsentExpirationTime() {
        return consentExpirationTime;
    }

    public void setConsentExpirationTime(String consentExpirationTime) {
        this.consentExpirationTime = consentExpirationTime;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOptionalProducts() {
        return optionalProducts;
    }

    public void setOptionalProducts(String optionalProducts) {
        this.optionalProducts = optionalProducts;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public String getWebhook() {
        return webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }
}
