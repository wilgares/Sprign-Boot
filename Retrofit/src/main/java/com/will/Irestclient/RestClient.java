package com.will.Irestclient;

import java.util.List;

import com.will.dto.Cliente;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Yo.
 */
public interface RestClient {

    @GET("/clientes")
    Call<List<Cliente>> listaClientes();

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://servicio-monkydevs.rhcloud.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

   /* public interface DisbursementClient {

    @POST("loan/")
    Call<DisbursementResponse> addLoan(@Body LoanDto loanDto);

    }*/
}
