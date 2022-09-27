package com.bankdetails.service;

import com.bankdetails.core.AccessKey;
import com.bankdetails.core.PublicKey;
import com.bankdetails.exception.AccessTokenException;
import com.bankdetails.requestBody.AccessTokenBody;
import com.bankdetails.requestBody.ClientRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class TokenService {
    private String clientId;
    private String clientSecret;
    @Autowired
    private RestTemplate restTemplate;

    public String getAccessToken(ClientRequestBody client) {
        try {
            this.clientId = client.getClientId();
            this.clientSecret = client.getClientSecret();

            String publicKey = getPublicKey(client);
            String accessKey = getAccessKey(publicKey);

            return accessKey;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new AccessTokenException("failed to fet token!");
        }
    }

    private String getPublicKey(ClientRequestBody clientBody) {
        String url = "https://sandbox.plaid.com/sandbox/public_token/create";
        PublicKey publicKey = restTemplate.postForEntity(url, clientBody, PublicKey.class).getBody();

        return publicKey.getPublicToken();
    }

    private String getAccessKey(String publicKey) {
        String url = "https://sandbox.plaid.com/item/public_token/exchange";
        AccessTokenBody body = new AccessTokenBody();
        body.setClientId(clientId);
        body.setSecretId(clientSecret);
        body.setPublicToken(publicKey);
        AccessKey accessKey = restTemplate.postForEntity(url, body, AccessKey.class).getBody();

        return accessKey.getAccessToken();
    }

}
