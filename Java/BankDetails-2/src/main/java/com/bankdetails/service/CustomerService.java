package com.bankdetails.service;

import com.bankdetails.core.BaseResponse;
import com.bankdetails.dto.CustomerDto;
import com.bankdetails.requestBody.ClientRequestBody;

/**
 * @author BS987
 * created date: 9/28/2022
 */
public interface CustomerService {
    BaseResponse<CustomerDto> getCustomerAccount(ClientRequestBody clientRequestBody);
}
