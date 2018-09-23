package com.will.controller;

import com.will.Irestclient.RestAxiomaClient;
import com.will.dto2.ResponseWrapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bcp")
public class Controlador3 {

    private final RestAxiomaClient restAxiomaClient;

    public Controlador3(RestAxiomaClient restAxiomaClient) {
        super();
        this.restAxiomaClient = restAxiomaClient;
    }

    @ApiOperation(value = "Get the current Exchange Rate")
    @GetMapping(value = "/exchange-rate")
    @ResponseBody
    public ResponseWrapper requestExchangeRate() throws Exception {
        ResponseWrapper currencyResponseDto =
                this.restAxiomaClient.findAllExchangeRate().execute().body();
        return currencyResponseDto;
    }
}
