package com.bankdetails.core;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessKey {
    @JsonProperty(value = "access_token")
    private String accessToken;
    @JsonProperty(value = "item_id")
    private String itemId;
    @JsonProperty(value = "request_id")
    private String requestId;
}
