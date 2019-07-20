package com.example.mandirionline.network.model;

import com.google.gson.annotations.SerializedName;

public class ServiceCustomerDetailResponse{

	@SerializedName("Response")
	private Response response;

	public void setResponse(Response response){
		this.response = response;
	}

	public Response getResponse(){
		return response;
	}

	@Override
 	public String toString(){
		return 
			"ServiceCustomerDetailResponse{" + 
			"response = '" + response + '\'' + 
			"}";
		}
}