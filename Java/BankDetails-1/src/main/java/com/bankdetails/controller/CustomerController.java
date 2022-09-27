package com.bankdetails.controller;

import com.bankdetails.core.BaseResponse;
import com.bankdetails.requestBody.ClientRequestBody;
import com.bankdetails.entity.Customer;
import com.bankdetails.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private AccountService service;

    @PostMapping("/balance")
    private BaseResponse<Customer> getAllBalance(@RequestBody ClientRequestBody client){
        return service.getBalance(client);
    }

}
