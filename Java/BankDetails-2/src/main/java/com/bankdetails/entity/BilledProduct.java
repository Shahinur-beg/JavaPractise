package com.bankdetails.entity;

import com.bankdetails.core.BaseEntity;

import javax.persistence.*;

/**
 * @author BS987
 * created date: 9/27/2022
 */
@Entity
@Table(name = "BilledProduct")
public class BilledProduct extends BaseEntity{
    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
