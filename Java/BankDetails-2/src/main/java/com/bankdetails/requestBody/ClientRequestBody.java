package com.bankdetails.requestBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientRequestBody {
    @JsonProperty(value = "client_id")
    private String clientId;
    @JsonProperty(value = "secret")
    private  String clientSecret;
    @JsonProperty(value = "institution_id")
    private String insId;
    @JsonProperty(value = "initial_products")
    private List<String> initialProduct;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getInsId() {
        return insId;
    }

    public void setInsId(String insId) {
        this.insId = insId;
    }

    public List<String> getInitialProduct() {
        return initialProduct;
    }

    public void setInitialProduct(List<String> initialProduct) {
        this.initialProduct = initialProduct;
    }
}
