package com.bankdetails.requestBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
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
}
