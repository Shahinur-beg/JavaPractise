package com.bankdetails.service;

import com.bankdetails.core.BaseResponse;
import com.bankdetails.entity.Customer;
import com.bankdetails.exception.AccessTokenException;
import com.bankdetails.repository.CustomerRepository;
import com.bankdetails.requestBody.BalanceBody;
import com.bankdetails.requestBody.ClientRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccountService {
    @Autowired
    private TokenService tokenService;
    @Autowired
    private BaseResponse<Customer> baseResponse;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private CustomerRepository repository;

    public BaseResponse<Customer> getBalance(ClientRequestBody client) {
        try {
            String accessToken;
            accessToken = tokenService.getAccessToken(client);

            if (accessToken != null) {
                Customer balance = getAccountBalance(client, accessToken);

                // TODO: 9/27/2022 convert to entity

                repository.save(balance);
                baseResponse.setBalance(balance);
                baseResponse.setStatusMessage("You are verified!!");
                baseResponse.setStatusCode(200);
            }

        } catch (AccessTokenException e) {
            baseResponse.setBalance(null);
            baseResponse.setStatusMessage("You are not verified!!!");
            baseResponse.setStatusCode(404);
        } catch (Exception e) {
            baseResponse.setBalance(null);
            baseResponse.setStatusMessage(e.getMessage());
            baseResponse.setStatusCode(500);
        }
        return baseResponse;
    }

    private Customer getAccountBalance(ClientRequestBody client, String accessToken) {
        String url = "https://sandbox.plaid.com/accounts/balance/get";
        BalanceBody body = new BalanceBody();
        body.setClientId(client.getClientId());
        body.setSecretId(client.getClientSecret());
        body.setAccessToken(accessToken);
        Customer customer = restTemplate.postForEntity(url, body, Customer.class).getBody();

        return customer;
    }

}
