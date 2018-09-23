package com.will.Irestclient;

import com.will.dto2.ResponseWrapper;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestAxiomaClient {

    @GET("/api/bcp/currency/value")
    Call<ResponseWrapper> findAllExchangeRate();
}
