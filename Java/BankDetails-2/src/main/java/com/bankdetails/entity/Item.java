package com.bankdetails.entity;

import com.bankdetails.core.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accountItem")
public class Item extends BaseEntity{
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "AvailableProductId")
    private List<AvailableProduct> availableProducts = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "BilledProductId")
    private List<BilledProduct> billedProducts = new ArrayList<>();
    private String consentExpirationTime;
    private String error;
    private String institutionId;
    private String itemId;
    private String optionalProducts;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ProductsId")
    private List<Products> products = new ArrayList<>();
    private String updateType;
    private String webhook;

    public List<AvailableProduct> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(List<AvailableProduct> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public List<BilledProduct> getBilledProducts() {
        return billedProducts;
    }

    public void setBilledProducts(List<BilledProduct> billedProducts) {
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

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
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
