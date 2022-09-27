package com.bankdetails.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublicKey {
    @JsonProperty(value = "public_token")
    private String publicToken;
    @JsonProperty(value = "request_id")
    private String requestId;
}
