package com.api.mysql_api.baseResponse;

import org.springframework.stereotype.Component;

@Component
public class EmployeeResponse<T> {
    private T Data;
    private String statusMessage;
    private int statusCode;

    public T getData() {
        return Data;
    }
    public void setData(T data) {
        Data = data;
    }
    public String getStatusMessage() {
        return statusMessage;
    }
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
    public int getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
