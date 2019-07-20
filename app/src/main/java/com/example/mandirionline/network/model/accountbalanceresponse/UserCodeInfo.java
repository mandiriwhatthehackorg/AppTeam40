package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserCodeInfo{

	@SerializedName("userCode")
	private List<UserCodeItem> userCode;

	public void setUserCode(List<UserCodeItem> userCode){
		this.userCode = userCode;
	}

	public List<UserCodeItem> getUserCode(){
		return userCode;
	}

	@Override
 	public String toString(){
		return 
			"UserCodeInfo{" + 
			"userCode = '" + userCode + '\'' + 
			"}";
		}
}