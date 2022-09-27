package com.bankdetails.entity;

import com.bankdetails.core.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "accountItem")
public class Item extends BaseEntity {

    @JsonProperty("available_products")
    @ElementCollection
    private List<String> availableProducts;

    @JsonProperty("billed_products")
    @ElementCollection
    private List<String> billedProducts;

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
    @ElementCollection
    private List<String> products;

    @JsonProperty("update_type")
    private String updateType;
    @JsonProperty("webhook")
    private String webhook;
}
