package com.example.mandirionline.network.model.customeraccountnumber;

import com.google.gson.annotations.SerializedName;

public class UserCodeItem{

	@SerializedName("code")
	private String code;

	@SerializedName("value")
	private String value;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"UserCodeItem{" + 
			"code = '" + code + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}