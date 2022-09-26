package com.bankdetails.controller;

import com.bankdetails.core.BaseResponse;
import com.bankdetails.core.ClientDetails;
import com.bankdetails.service.AccountService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountService service;

    @PostMapping("/balance")
    private BaseResponse<Object> getAllBalance(@NotNull @RequestBody ClientDetails client){
        return service.getBalance(client);
    }

}
