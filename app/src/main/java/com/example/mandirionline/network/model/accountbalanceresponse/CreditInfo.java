package com.example.mandirionline.network.model.accountbalanceresponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CreditInfo{

	@SerializedName("creditInfo")
	private List<CreditInfoItem> creditInfo;

	public void setCreditInfo(List<CreditInfoItem> creditInfo){
		this.creditInfo = creditInfo;
	}

	public List<CreditInfoItem> getCreditInfo(){
		return creditInfo;
	}

	@Override
 	public String toString(){
		return 
			"CreditInfo{" + 
			"creditInfo = '" + creditInfo + '\'' + 
			"}";
		}
}