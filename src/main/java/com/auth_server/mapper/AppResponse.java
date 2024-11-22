package com.auth_server.mapper;

import lombok.Data;

@Data
public class AppResponse {
    private boolean success;
    private Object data;

    public static AppResponse getSuccessResponse() {
        AppResponse response = new AppResponse();
        response.setSuccess(true);
        return  response;
    }
    public static AppResponse getSuccessResponse(Object data) {
        AppResponse response = new AppResponse();
        response.setSuccess(true);
        response.setData(data);
        return  response;
    }
}
