package com.will.dto2;

import com.google.gson.annotations.SerializedName;

public class ResponseWrapper {

    @SerializedName("success")
    public boolean success;

    @SerializedName("response")
    public Object response;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}

