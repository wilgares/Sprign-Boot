package com.will.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.will.Irestclient.RestClient;
import com.will.dto.Cliente;

import retrofit2.Call;

/**
 * Created by S45399 on 04/11/2016.
 */


//indica que la clase esta lista para usarse por Spring MVC para manejar peticiones web
//@Controller de la version de Spring 3.0 y obligatoriamente tendras que utilizar en el metodo @ResponseBody
//@RESTController de la version de Spring 4.0 y NO tendras que utilizar en el metodo @ResponseBody
@Controller
@RequestMapping("/api/cliente")
public class Controlador1 {

	
	
    @RequestMapping(value = "/{indice}", method = RequestMethod.GET)
    //@ResponseBody -- es lo mismo utilizarlo aqui que una linea abajo
    public @ResponseBody List<Cliente> restService(@PathVariable("indice") final String indice) throws Exception {

        RestClient restClient = RestClient.retrofit.create(RestClient.class);
        Call<List<Cliente>>  call = restClient.listaClientes();

        List<Cliente> listilla = call.execute().body();

        return listilla;
        
    }

 
}