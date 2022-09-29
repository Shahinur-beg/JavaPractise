package com.bankdetails.controller;

import com.bankdetails.core.BaseResponse;
import com.bankdetails.dto.CustomerDto;
import com.bankdetails.requestBody.ClientRequestBody;
import com.bankdetails.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerServiceImpl service;

    @PostMapping("/balance")
    private BaseResponse<CustomerDto> getAllBalance(@RequestBody ClientRequestBody client){
        return service.getCustomerAccount(client);
    }

}
