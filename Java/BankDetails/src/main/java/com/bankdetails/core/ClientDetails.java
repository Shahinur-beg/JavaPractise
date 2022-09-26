package com.bankdetails.core;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ClientDetails {
    private String clientId;
    private  String clientSecret;
    private String insId;
}
