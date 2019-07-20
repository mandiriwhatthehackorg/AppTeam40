package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

public class AccountInfo{

	@SerializedName("accountGroupNumber")
	private String accountGroupNumber;

	@SerializedName("currencyType")
	private String currencyType;

	@SerializedName("aliasName")
	private String aliasName;

	@SerializedName("cifNumber")
	private String cifNumber;

	@SerializedName("closeStatus")
	private String closeStatus;

	@SerializedName("glGroupCode")
	private String glGroupCode;

	@SerializedName("currencyDecimals")
	private String currencyDecimals;

	@SerializedName("branchNumber")
	private String branchNumber;

	@SerializedName("officer")
	private String officer;

	@SerializedName("shortName")
	private String shortName;

	@SerializedName("additionalName")
	private String additionalName;

	@SerializedName("class")
	private String jsonMemberClass;

	@SerializedName("alternateAddress")
	private String alternateAddress;

	@SerializedName("status")
	private String status;

	public void setAccountGroupNumber(String accountGroupNumber){
		this.accountGroupNumber = accountGroupNumber;
	}

	public String getAccountGroupNumber(){
		return accountGroupNumber;
	}

	public void setCurrencyType(String currencyType){
		this.currencyType = currencyType;
	}

	public String getCurrencyType(){
		return currencyType;
	}

	public void setAliasName(String aliasName){
		this.aliasName = aliasName;
	}

	public String getAliasName(){
		return aliasName;
	}

	public void setCifNumber(String cifNumber){
		this.cifNumber = cifNumber;
	}

	public String getCifNumber(){
		return cifNumber;
	}

	public void setCloseStatus(String closeStatus){
		this.closeStatus = closeStatus;
	}

	public String getCloseStatus(){
		return closeStatus;
	}

	public void setGlGroupCode(String glGroupCode){
		this.glGroupCode = glGroupCode;
	}

	public String getGlGroupCode(){
		return glGroupCode;
	}

	public void setCurrencyDecimals(String currencyDecimals){
		this.currencyDecimals = currencyDecimals;
	}

	public String getCurrencyDecimals(){
		return currencyDecimals;
	}

	public void setBranchNumber(String branchNumber){
		this.branchNumber = branchNumber;
	}

	public String getBranchNumber(){
		return branchNumber;
	}

	public void setOfficer(String officer){
		this.officer = officer;
	}

	public String getOfficer(){
		return officer;
	}

	public void setShortName(String shortName){
		this.shortName = shortName;
	}

	public String getShortName(){
		return shortName;
	}

	public void setAdditionalName(String additionalName){
		this.additionalName = additionalName;
	}

	public String getAdditionalName(){
		return additionalName;
	}

	public void setJsonMemberClass(String jsonMemberClass){
		this.jsonMemberClass = jsonMemberClass;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}

	public void setAlternateAddress(String alternateAddress){
		this.alternateAddress = alternateAddress;
	}

	public String getAlternateAddress(){
		return alternateAddress;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"AccountInfo{" + 
			"accountGroupNumber = '" + accountGroupNumber + '\'' + 
			",currencyType = '" + currencyType + '\'' + 
			",aliasName = '" + aliasName + '\'' + 
			",cifNumber = '" + cifNumber + '\'' + 
			",closeStatus = '" + closeStatus + '\'' + 
			",glGroupCode = '" + glGroupCode + '\'' + 
			",currencyDecimals = '" + currencyDecimals + '\'' + 
			",branchNumber = '" + branchNumber + '\'' + 
			",officer = '" + officer + '\'' + 
			",shortName = '" + shortName + '\'' + 
			",additionalName = '" + additionalName + '\'' + 
			",class = '" + jsonMemberClass + '\'' + 
			",alternateAddress = '" + alternateAddress + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}