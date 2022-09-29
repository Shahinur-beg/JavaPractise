package com.bankdetails.service.impl;

import com.bankdetails.core.BaseResponse;
import com.bankdetails.dto.CustomerDto;
import com.bankdetails.entity.Customer;
import com.bankdetails.exception.AccessTokenException;
import com.bankdetails.mapper.DtoToCustomer;
import com.bankdetails.repository.CustomerRepository;
import com.bankdetails.requestBody.BalanceBody;
import com.bankdetails.requestBody.ClientRequestBody;
import com.bankdetails.service.CustomerService;
import com.bankdetails.service.TokenService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CustomerServiceImpl implements CustomerService {
    private final TokenService tokenService;
    private final BaseResponse<CustomerDto> baseResponse;
    private final RestTemplate restTemplate;
    private final CustomerRepository customerRepository;
    private final DtoToCustomer dtoToCustomerEntity;

    public CustomerServiceImpl(TokenService tokenService, BaseResponse<CustomerDto> baseResponse, RestTemplate restTemplate, CustomerRepository repository, DtoToCustomer dtoToCustomer, DtoToCustomer dtoToCustomerEntity) {
        this.tokenService = tokenService;
        this.baseResponse = baseResponse;
        this.restTemplate = restTemplate;
        this.customerRepository = repository;
        this.dtoToCustomerEntity = dtoToCustomerEntity;
    }

    public BaseResponse<CustomerDto> getCustomerAccount(ClientRequestBody client) {
        try {
            String accessToken;
            accessToken = tokenService.getAccessToken(client);

            if (accessToken != null) {
                CustomerDto dto = getAccountBalance(client, accessToken);
                baseResponse.setBalance(dto);
                baseResponse.setStatusMessage("You are verified!!");
                baseResponse.setStatusCode(200);
                Customer customer = dtoToCustomerEntity.dtoToCustomer(dto);
                customerRepository.save(customer);
            }

        } catch (AccessTokenException e) {
            baseResponse.setBalance(null);
            baseResponse.setStatusMessage(e.getMessage());
            baseResponse.setStatusCode(404);
        } catch (Exception e) {
            baseResponse.setBalance(null);
            baseResponse.setStatusMessage(e.getMessage());
            baseResponse.setStatusCode(500);
        }
        return baseResponse;
    }

    private CustomerDto getAccountBalance(ClientRequestBody client, String accessToken) {
        String url = "https://sandbox.plaid.com/accounts/balance/get";
        BalanceBody body = new BalanceBody();
        body.setClientId(client.getClientId());
        body.setSecretId(client.getClientSecret());
        body.setAccessToken(accessToken);
        CustomerDto customer = restTemplate.postForEntity(url, body, CustomerDto.class).getBody();

        return customer;
    }

}
