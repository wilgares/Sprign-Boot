package com.will.restclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.will.Irestclient.RestPaisClient;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


//Spring @Configuration :Anotación encargada de definir que la clase es una clase de configuración para el framework
//Spring @Bean :Anotación que marca como bean cada uno de los métodos de tal forma que esten disponibles para Spring
//en algun lugar al arrancar debe llerse esta clase  para nuestro caso se realiza en el init aplicacion .. se le agrega el paquete @ComponentScan(
@Configuration
public class ObtenerPais {

	
	
	@Bean
	public RestPaisClient restPais() {
		
		/* Estas lineas nos permiten crear un interceptor para el llamaodo 
		 * a los rest services. nos permite pintar las trazas en la consola */
		//***************************************************************
		HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
		loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
		OkHttpClient  client = new OkHttpClient.Builder()
				.addInterceptor(loggingInterceptor)
				.build();
		//***************************************************************
		
		return new Retrofit.Builder()
	            .baseUrl("http://services.groupkt.com")
	            .client(client)
	            .addConverterFactory(GsonConverterFactory.create())
	            .build()
	            .create(RestPaisClient.class);
	}
   
}
