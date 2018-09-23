package com.will.dto;

import com.google.gson.annotations.SerializedName;

public class ResponseWrapperListaAllPais {
	
	@SerializedName("RestResponse")
	public WraperListaAllPais restResponse;

	public WraperListaAllPais getRestResponse() {
		return restResponse;
	}

	public void setRestResponse(WraperListaAllPais restResponse) {
		this.restResponse = restResponse;
	}


	
}
