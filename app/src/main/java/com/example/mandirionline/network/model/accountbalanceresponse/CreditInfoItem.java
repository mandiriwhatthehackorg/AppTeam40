package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

public class CreditInfoItem{

	@SerializedName("creditValue")
	private String creditValue;

	@SerializedName("creditName")
	private String creditName;

	public void setCreditValue(String creditValue){
		this.creditValue = creditValue;
	}

	public String getCreditValue(){
		return creditValue;
	}

	public void setCreditName(String creditName){
		this.creditName = creditName;
	}

	public String getCreditName(){
		return creditName;
	}

	@Override
 	public String toString(){
		return 
			"CreditInfoItem{" + 
			"creditValue = '" + creditValue + '\'' + 
			",creditName = '" + creditName + '\'' + 
			"}";
		}
}