package com.will.restclient;

import com.will.Irestclient.RestAxiomaClient;
import com.will.Irestclient.RestPaisClient;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class AxiomaService {

    @Bean
    public RestAxiomaClient restAxiomaClient() {

		/* Estas lineas nos permiten crear un interceptor para el llamaodo
		 * a los rest services. nos permite pintar las trazas en la consola */
        //***************************************************************
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();
        //***************************************************************

        return new Retrofit.Builder()
                .baseUrl("http://127.0.0.1:9000")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RestAxiomaClient.class);
    }
}
