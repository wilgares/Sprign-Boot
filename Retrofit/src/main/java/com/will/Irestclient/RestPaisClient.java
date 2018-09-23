package com.will.Irestclient;


import com.will.dto.ResponseWrapperListaAllPais;
import com.will.dto.ResponseWrapperListaPais;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;




/// URL :  http://services.groupkt.com/country/get/all
// {
//  "RestResponse" : {
//    "messages" : [ "More webservices are available at http://www.groupkt.com/post/f2129b88/services.htm", "Total [249] records found." ],
//    "result" : [ {
//      "name" : "Afghanistan",
//      "alpha2_code" : "AF",
//      "alpha3_code" : "AFG"
//    }, {
//      "name" : "Åland Islands",
//      "alpha2_code" : "AX",
//      "alpha3_code" : "ALA"
//    }, {            ..............   




public interface RestPaisClient {	

	@GET("/country/get/all")
	Call<ResponseWrapperListaAllPais> listaAllPaises();

	@GET("/country/get/iso2code/{iso_code}")
	Call<ResponseWrapperListaPais> listaPais(@Path("iso_code") final String iso_code);
	
}
