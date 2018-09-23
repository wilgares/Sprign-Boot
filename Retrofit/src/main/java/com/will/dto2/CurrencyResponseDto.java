package com.will.dto2;

import java.util.List;

public class CurrencyResponseDto {

    private String message;
    private List<CurrencyTypeDto> currencyTypeDtoList;

    public String getMessage() {
        return message;
    }

    public List<CurrencyTypeDto> getCurrencyTypeDtoList() {
        return currencyTypeDtoList;
    }
    
}
