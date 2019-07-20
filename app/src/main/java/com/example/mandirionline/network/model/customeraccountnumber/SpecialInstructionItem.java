package com.example.mandirionline.network.model.customeraccountnumber;

import com.google.gson.annotations.SerializedName;

public class SpecialInstructionItem{

	@SerializedName("siCode")
	private String siCode;

	@SerializedName("siValue")
	private String siValue;

	public void setSiCode(String siCode){
		this.siCode = siCode;
	}

	public String getSiCode(){
		return siCode;
	}

	public void setSiValue(String siValue){
		this.siValue = siValue;
	}

	public String getSiValue(){
		return siValue;
	}

	@Override
 	public String toString(){
		return 
			"SpecialInstructionItem{" + 
			"siCode = '" + siCode + '\'' + 
			",siValue = '" + siValue + '\'' + 
			"}";
		}
}