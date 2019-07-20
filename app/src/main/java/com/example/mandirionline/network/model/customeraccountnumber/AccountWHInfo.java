package com.example.mandirionline.network.model.customeraccountnumber;

import com.google.gson.annotations.SerializedName;

public class AccountWHInfo{

	@SerializedName("federalWHMTD")
	private String federalWHMTD;

	@SerializedName("fedWHAlternateRate")
	private String fedWHAlternateRate;

	@SerializedName("federalWHCode")
	private String federalWHCode;

	@SerializedName("federalWHLastYear")
	private String federalWHLastYear;

	@SerializedName("fedWHToday")
	private String fedWHToday;

	@SerializedName("stateWHAlternateRate")
	private String stateWHAlternateRate;

	@SerializedName("stateWHYTD")
	private String stateWHYTD;

	@SerializedName("stateWHMTD")
	private String stateWHMTD;

	@SerializedName("stateWHCode")
	private String stateWHCode;

	@SerializedName("alternateAccountNo")
	private String alternateAccountNo;

	@SerializedName("stateWHQTD")
	private String stateWHQTD;

	@SerializedName("stateWHToday")
	private String stateWHToday;

	@SerializedName("stateWHLastYear")
	private String stateWHLastYear;

	@SerializedName("federalWHYTD")
	private String federalWHYTD;

	@SerializedName("alternateAccountType")
	private String alternateAccountType;

	@SerializedName("state")
	private String state;

	@SerializedName("dateWHCodeChanged")
	private String dateWHCodeChanged;

	@SerializedName("federalWHQTD")
	private String federalWHQTD;

	public void setFederalWHMTD(String federalWHMTD){
		this.federalWHMTD = federalWHMTD;
	}

	public String getFederalWHMTD(){
		return federalWHMTD;
	}

	public void setFedWHAlternateRate(String fedWHAlternateRate){
		this.fedWHAlternateRate = fedWHAlternateRate;
	}

	public String getFedWHAlternateRate(){
		return fedWHAlternateRate;
	}

	public void setFederalWHCode(String federalWHCode){
		this.federalWHCode = federalWHCode;
	}

	public String getFederalWHCode(){
		return federalWHCode;
	}

	public void setFederalWHLastYear(String federalWHLastYear){
		this.federalWHLastYear = federalWHLastYear;
	}

	public String getFederalWHLastYear(){
		return federalWHLastYear;
	}

	public void setFedWHToday(String fedWHToday){
		this.fedWHToday = fedWHToday;
	}

	public String getFedWHToday(){
		return fedWHToday;
	}

	public void setStateWHAlternateRate(String stateWHAlternateRate){
		this.stateWHAlternateRate = stateWHAlternateRate;
	}

	public String getStateWHAlternateRate(){
		return stateWHAlternateRate;
	}

	public void setStateWHYTD(String stateWHYTD){
		this.stateWHYTD = stateWHYTD;
	}

	public String getStateWHYTD(){
		return stateWHYTD;
	}

	public void setStateWHMTD(String stateWHMTD){
		this.stateWHMTD = stateWHMTD;
	}

	public String getStateWHMTD(){
		return stateWHMTD;
	}

	public void setStateWHCode(String stateWHCode){
		this.stateWHCode = stateWHCode;
	}

	public String getStateWHCode(){
		return stateWHCode;
	}

	public void setAlternateAccountNo(String alternateAccountNo){
		this.alternateAccountNo = alternateAccountNo;
	}

	public String getAlternateAccountNo(){
		return alternateAccountNo;
	}

	public void setStateWHQTD(String stateWHQTD){
		this.stateWHQTD = stateWHQTD;
	}

	public String getStateWHQTD(){
		return stateWHQTD;
	}

	public void setStateWHToday(String stateWHToday){
		this.stateWHToday = stateWHToday;
	}

	public String getStateWHToday(){
		return stateWHToday;
	}

	public void setStateWHLastYear(String stateWHLastYear){
		this.stateWHLastYear = stateWHLastYear;
	}

	public String getStateWHLastYear(){
		return stateWHLastYear;
	}

	public void setFederalWHYTD(String federalWHYTD){
		this.federalWHYTD = federalWHYTD;
	}

	public String getFederalWHYTD(){
		return federalWHYTD;
	}

	public void setAlternateAccountType(String alternateAccountType){
		this.alternateAccountType = alternateAccountType;
	}

	public String getAlternateAccountType(){
		return alternateAccountType;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setDateWHCodeChanged(String dateWHCodeChanged){
		this.dateWHCodeChanged = dateWHCodeChanged;
	}

	public String getDateWHCodeChanged(){
		return dateWHCodeChanged;
	}

	public void setFederalWHQTD(String federalWHQTD){
		this.federalWHQTD = federalWHQTD;
	}

	public String getFederalWHQTD(){
		return federalWHQTD;
	}

	@Override
 	public String toString(){
		return 
			"AccountWHInfo{" + 
			"federalWHMTD = '" + federalWHMTD + '\'' + 
			",fedWHAlternateRate = '" + fedWHAlternateRate + '\'' + 
			",federalWHCode = '" + federalWHCode + '\'' + 
			",federalWHLastYear = '" + federalWHLastYear + '\'' + 
			",fedWHToday = '" + fedWHToday + '\'' + 
			",stateWHAlternateRate = '" + stateWHAlternateRate + '\'' + 
			",stateWHYTD = '" + stateWHYTD + '\'' + 
			",stateWHMTD = '" + stateWHMTD + '\'' + 
			",stateWHCode = '" + stateWHCode + '\'' + 
			",alternateAccountNo = '" + alternateAccountNo + '\'' + 
			",stateWHQTD = '" + stateWHQTD + '\'' + 
			",stateWHToday = '" + stateWHToday + '\'' + 
			",stateWHLastYear = '" + stateWHLastYear + '\'' + 
			",federalWHYTD = '" + federalWHYTD + '\'' + 
			",alternateAccountType = '" + alternateAccountType + '\'' + 
			",state = '" + state + '\'' + 
			",dateWHCodeChanged = '" + dateWHCodeChanged + '\'' + 
			",federalWHQTD = '" + federalWHQTD + '\'' + 
			"}";
		}
}