package com.example.mandirionline.network.model.accountbalanceresponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DebitInfo{

	@SerializedName("debitInfo")
	private List<DebitInfoItem> debitInfo;

	public void setDebitInfo(List<DebitInfoItem> debitInfo){
		this.debitInfo = debitInfo;
	}

	public List<DebitInfoItem> getDebitInfo(){
		return debitInfo;
	}

	@Override
 	public String toString(){
		return 
			"DebitInfo{" + 
			"debitInfo = '" + debitInfo + '\'' + 
			"}";
		}
}