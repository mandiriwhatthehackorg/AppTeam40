package com.example.mandirionline.network.model.customeraccountnumber;

import com.google.gson.annotations.SerializedName;

public class CustomerBalanceResponse{

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
			"CustomerBalanceResponse{" + 
			"response = '" + response + '\'' + 
			"}";
		}
}