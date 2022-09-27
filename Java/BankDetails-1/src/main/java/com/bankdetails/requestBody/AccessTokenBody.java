package com.bankdetails.requestBody;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessTokenBody {
    @JsonProperty(value = "client_id")
    private String clientId;
    @JsonProperty(value = "secret")
    private String secretId;
    @JsonProperty(value = "public_token")
    private String publicToken;
}
