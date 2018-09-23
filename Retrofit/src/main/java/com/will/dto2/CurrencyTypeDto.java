package com.will.dto2;

import java.math.BigDecimal;

/**
 * Created by Pablo on 30/11/2016.
 */
public class CurrencyTypeDto {

    private String typeConvention;
    private BigDecimal minValue;
    private BigDecimal maxValue;
    private String currencyTypeCode;
    private String typeCodeDescription;
    private BigDecimal buyAmount;
    private BigDecimal sellAmount;

    public String getTypeConvention() {
        return typeConvention;
    }

    public void setTypeConvention(String typeConvention) {
        this.typeConvention = typeConvention;
    }

    public BigDecimal getMinValue() {
        return minValue;
    }

    public void setMinValue(BigDecimal minValue) {
        this.minValue = minValue;
    }

    public BigDecimal getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    public String getCurrencyTypeCode() {
        return currencyTypeCode;
    }

    public void setCurrencyTypeCode(String currencyTypeCode) {
        this.currencyTypeCode = currencyTypeCode;
    }

    public String getTypeCodeDescription() {
        return typeCodeDescription;
    }

    public void setTypeCodeDescription(String typeCodeDescription) {
        this.typeCodeDescription = typeCodeDescription;
    }

    public BigDecimal getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(BigDecimal buyAmount) {
        this.buyAmount = buyAmount;
    }

    public BigDecimal getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(BigDecimal sellAmount) {
        this.sellAmount = sellAmount;
    }
    
}
