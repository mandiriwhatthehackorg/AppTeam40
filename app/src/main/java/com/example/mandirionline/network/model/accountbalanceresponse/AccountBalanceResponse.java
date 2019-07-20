package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

public class AccountBalanceResponse{

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
			"AccountBalanceResponse{" + 
			"response = '" + response + '\'' + 
			"}";
		}
}