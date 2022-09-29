package com.bankdetails.entity;

import com.bankdetails.core.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer extends BaseEntity{
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "AccountKey")
    private List<Account> accounts = null;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ItemKey")
    private Item item;
    private String requestId;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
