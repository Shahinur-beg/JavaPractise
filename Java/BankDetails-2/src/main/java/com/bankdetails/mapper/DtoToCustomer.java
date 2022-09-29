package com.bankdetails.mapper;

import com.bankdetails.dto.AccountDto;
import com.bankdetails.dto.CustomerDto;
import com.bankdetails.entity.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BS987
 * created date: 9/28/2022
 */
@Component
public class DtoToCustomer {
    public Customer dtoToCustomer(CustomerDto dto){
        Customer customer = new Customer();
        customer.setRequestId(dto.getRequestId());
        List<Account> accounts = new ArrayList<>();
        for(AccountDto accountDto: dto.getAccounts()){
            Account account = new Account();

            Balance balance = new Balance();
            balance.setAvailable(accountDto.getBalances().getAvailable());
            balance.setCurrent(accountDto.getBalances().getCurrent());
            balance.setLimit(accountDto.getBalances().getLimit());
            balance.setIsoCurrencyCode(accountDto.getBalances().getIsoCurrencyCode());
            balance.setUnofficialCurrencyCode(accountDto.getBalances().getUnofficialCurrencyCode());

            account.setBalances(balance);
            account.setAccountId(accountDto.getAccountId());
            account.setMask(accountDto.getMask());
            account.setName(accountDto.getName());
            account.setSubtype(accountDto.getSubtype());
            account.setType(accountDto.getType());
            account.setOfficialName(accountDto.getOfficialName());
            accounts.add(account);
        }
        customer.setAccounts(accounts);
        Item item = new Item();

        List<AvailableProduct> availableProducts = new ArrayList<>();
        for(String product:dto.getItem().getAvailableProducts()){
            AvailableProduct availableProduct = new AvailableProduct();
            availableProduct.setItem(product);
            availableProducts.add(availableProduct);
        }
        item.setAvailableProducts(availableProducts);

        List<BilledProduct> billedProducts = new ArrayList<>();
        for(String product: dto.getItem().getProducts() ){
            BilledProduct billedProduct = new BilledProduct();
            billedProduct.setItem(product);
            billedProducts.add(billedProduct);
        }
        item.setBilledProducts(billedProducts);

        List<Products> products = new ArrayList<>();
        for(String product: dto.getItem().getProducts()){
            Products products1 = new Products();
            products1.setItem(product);
            products.add(products1);
        }
        item.setProducts(products);

        item.setItemId(dto.getItem().getItemId());
        item.setError(dto.getItem().getError());
        item.setConsentExpirationTime(dto.getItem().getConsentExpirationTime());
        item.setInstitutionId(dto.getItem().getInstitutionId());
        item.setOptionalProducts(dto.getItem().getOptionalProducts());
        item.setUpdateType(dto.getItem().getUpdateType());
        item.setWebhook(dto.getItem().getWebhook());

        customer.setItem(item);

        return customer;
    }
}
