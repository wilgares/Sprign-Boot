package com.will.dto;

import com.google.gson.annotations.SerializedName;

public class ResponseWrapperListaPais {
	
	@SerializedName("RestResponse")
	public WraperListaPais restResponse;

	public WraperListaPais getRestResponse() {
		return restResponse;
	}

	public void setRestResponse(WraperListaPais restResponse) {
		this.restResponse = restResponse;
	}


	
}
