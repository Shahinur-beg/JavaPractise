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
@Table(name = "Customer")
public class Customer extends BaseEntity {
    @JsonProperty("accounts")
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "CA_ID")
    private List<Account> accounts = null;

    @JsonProperty("item")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CI_ID")
    private Item item;

    @JsonProperty("request_id")
    private String requestId;
}
