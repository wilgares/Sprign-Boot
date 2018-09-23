package com.will.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.will.Irestclient.RestPaisClient;
import com.will.dto.ResponseWrapperListaAllPais;
import com.will.dto.ResponseWrapperListaPais;

@RestController
@RequestMapping("/api/pais")
public class Controlador2 {
	
	private final RestPaisClient restPaisClient;
	
	@Autowired
    public Controlador2(RestPaisClient restPaisClient) {
		super();
		this.restPaisClient = restPaisClient;
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseWrapperListaAllPais restServiceAllPais() throws Exception {

		//Response<ResponseWrapperListaAllPais>  listilla = this.restPaisClient.listaAllPaises().execute();
		ResponseWrapperListaAllPais  listilla = (ResponseWrapperListaAllPais) this.restPaisClient.listaAllPaises().execute().body();
		
        return listilla;
    }
    
    @RequestMapping(value = "/{iso_code}", method = RequestMethod.GET)
    public ResponseWrapperListaPais restServicePais(@PathVariable("iso_code") String iso_code) throws Exception {

    	ResponseWrapperListaPais  listilla = (ResponseWrapperListaPais) this.restPaisClient.listaPais(iso_code).execute().body();
        return listilla;
    }
}
   
