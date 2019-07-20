package com.example.mandirionline.network.model;

import com.google.gson.annotations.SerializedName;


public class TokenResponse {

	@SerializedName("jwt")
	private String jwt;

	public void setJwt(String jwt){
		this.jwt = jwt;
	}

	public String getJwt(){
		return jwt;
	}

	@Override
 	public String toString(){
		return 
			"TokenResponse{" + 
			"jwt = '" + jwt + '\'' + 
			"}";
		}
}