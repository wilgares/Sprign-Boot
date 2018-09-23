package com.will.dto;

import com.google.gson.annotations.SerializedName;

public class Pais {
	
	private String name;
	@SerializedName("alpha2_code")
	private String alpha2;
	@SerializedName("alpha3_code")
	private String alpha3;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlpha2() {
		return alpha2;
	}
	public void setAlpha2(String alpha2) {
		this.alpha2 = alpha2;
	}
	public String getAlpha3() {
		return alpha3;
	}
	public void setAlpha3(String alpha3) {
		this.alpha3 = alpha3;
	}
	
}
