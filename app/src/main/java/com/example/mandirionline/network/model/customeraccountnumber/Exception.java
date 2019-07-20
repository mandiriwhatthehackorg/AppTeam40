package com.example.mandirionline.network.model.customeraccountnumber;

import com.google.gson.annotations.SerializedName;

public class Exception{

	@SerializedName("status")
	private String status;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Exception{" + 
			"status = '" + status + '\'' + 
			"}";
		}
}