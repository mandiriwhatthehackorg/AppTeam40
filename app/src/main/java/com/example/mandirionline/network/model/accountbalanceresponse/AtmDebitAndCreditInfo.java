package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

public class AtmDebitAndCreditInfo{

	@SerializedName("amtOfOnUsATMDebits")
	private String amtOfOnUsATMDebits;

	@SerializedName("noOfFrgnATMCredits")
	private String noOfFrgnATMCredits;

	@SerializedName("amtOfONusATMCredits")
	private String amtOfONusATMCredits;

	@SerializedName("noOfOnUsATMDebits")
	private String noOfOnUsATMDebits;

	@SerializedName("noOfFrgnATMDebits")
	private String noOfFrgnATMDebits;

	@SerializedName("noOfOnUsATMCredits")
	private String noOfOnUsATMCredits;

	@SerializedName("amtOfFrgnATMCredits")
	private String amtOfFrgnATMCredits;

	@SerializedName("amtOfFrgnATMDebits")
	private String amtOfFrgnATMDebits;

	public void setAmtOfOnUsATMDebits(String amtOfOnUsATMDebits){
		this.amtOfOnUsATMDebits = amtOfOnUsATMDebits;
	}

	public String getAmtOfOnUsATMDebits(){
		return amtOfOnUsATMDebits;
	}

	public void setNoOfFrgnATMCredits(String noOfFrgnATMCredits){
		this.noOfFrgnATMCredits = noOfFrgnATMCredits;
	}

	public String getNoOfFrgnATMCredits(){
		return noOfFrgnATMCredits;
	}

	public void setAmtOfONusATMCredits(String amtOfONusATMCredits){
		this.amtOfONusATMCredits = amtOfONusATMCredits;
	}

	public String getAmtOfONusATMCredits(){
		return amtOfONusATMCredits;
	}

	public void setNoOfOnUsATMDebits(String noOfOnUsATMDebits){
		this.noOfOnUsATMDebits = noOfOnUsATMDebits;
	}

	public String getNoOfOnUsATMDebits(){
		return noOfOnUsATMDebits;
	}

	public void setNoOfFrgnATMDebits(String noOfFrgnATMDebits){
		this.noOfFrgnATMDebits = noOfFrgnATMDebits;
	}

	public String getNoOfFrgnATMDebits(){
		return noOfFrgnATMDebits;
	}

	public void setNoOfOnUsATMCredits(String noOfOnUsATMCredits){
		this.noOfOnUsATMCredits = noOfOnUsATMCredits;
	}

	public String getNoOfOnUsATMCredits(){
		return noOfOnUsATMCredits;
	}

	public void setAmtOfFrgnATMCredits(String amtOfFrgnATMCredits){
		this.amtOfFrgnATMCredits = amtOfFrgnATMCredits;
	}

	public String getAmtOfFrgnATMCredits(){
		return amtOfFrgnATMCredits;
	}

	public void setAmtOfFrgnATMDebits(String amtOfFrgnATMDebits){
		this.amtOfFrgnATMDebits = amtOfFrgnATMDebits;
	}

	public String getAmtOfFrgnATMDebits(){
		return amtOfFrgnATMDebits;
	}

	@Override
 	public String toString(){
		return 
			"AtmDebitAndCreditInfo{" + 
			"amtOfOnUsATMDebits = '" + amtOfOnUsATMDebits + '\'' + 
			",noOfFrgnATMCredits = '" + noOfFrgnATMCredits + '\'' + 
			",amtOfONusATMCredits = '" + amtOfONusATMCredits + '\'' + 
			",noOfOnUsATMDebits = '" + noOfOnUsATMDebits + '\'' + 
			",noOfFrgnATMDebits = '" + noOfFrgnATMDebits + '\'' + 
			",noOfOnUsATMCredits = '" + noOfOnUsATMCredits + '\'' + 
			",amtOfFrgnATMCredits = '" + amtOfFrgnATMCredits + '\'' + 
			",amtOfFrgnATMDebits = '" + amtOfFrgnATMDebits + '\'' + 
			"}";
		}
}