package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

public class DebitInfoItem{

	@SerializedName("debitValue")
	private String debitValue;

	@SerializedName("debitName")
	private String debitName;

	public void setDebitValue(String debitValue){
		this.debitValue = debitValue;
	}

	public String getDebitValue(){
		return debitValue;
	}

	public void setDebitName(String debitName){
		this.debitName = debitName;
	}

	public String getDebitName(){
		return debitName;
	}

	@Override
 	public String toString(){
		return 
			"DebitInfoItem{" + 
			"debitValue = '" + debitValue + '\'' + 
			",debitName = '" + debitName + '\'' + 
			"}";
		}
}