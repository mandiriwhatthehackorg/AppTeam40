package com.example.mandirionline.network.model.customeraccountnumber;

import com.google.gson.annotations.SerializedName;

public class InterestInfo{

	@SerializedName("accruedODInterest")
	private String accruedODInterest;

	@SerializedName("ytdInterestPaid")
	private String ytdInterestPaid;

	@SerializedName("previousYTDInterestPaid")
	private String previousYTDInterestPaid;

	@SerializedName("accruedInterest")
	private String accruedInterest;

	@SerializedName("alternateAccruedInterest")
	private String alternateAccruedInterest;

	@SerializedName("amtOfLastIntPd")
	private String amtOfLastIntPd;

	public void setAccruedODInterest(String accruedODInterest){
		this.accruedODInterest = accruedODInterest;
	}

	public String getAccruedODInterest(){
		return accruedODInterest;
	}

	public void setYtdInterestPaid(String ytdInterestPaid){
		this.ytdInterestPaid = ytdInterestPaid;
	}

	public String getYtdInterestPaid(){
		return ytdInterestPaid;
	}

	public void setPreviousYTDInterestPaid(String previousYTDInterestPaid){
		this.previousYTDInterestPaid = previousYTDInterestPaid;
	}

	public String getPreviousYTDInterestPaid(){
		return previousYTDInterestPaid;
	}

	public void setAccruedInterest(String accruedInterest){
		this.accruedInterest = accruedInterest;
	}

	public String getAccruedInterest(){
		return accruedInterest;
	}

	public void setAlternateAccruedInterest(String alternateAccruedInterest){
		this.alternateAccruedInterest = alternateAccruedInterest;
	}

	public String getAlternateAccruedInterest(){
		return alternateAccruedInterest;
	}

	public void setAmtOfLastIntPd(String amtOfLastIntPd){
		this.amtOfLastIntPd = amtOfLastIntPd;
	}

	public String getAmtOfLastIntPd(){
		return amtOfLastIntPd;
	}

	@Override
 	public String toString(){
		return 
			"InterestInfo{" + 
			"accruedODInterest = '" + accruedODInterest + '\'' + 
			",ytdInterestPaid = '" + ytdInterestPaid + '\'' + 
			",previousYTDInterestPaid = '" + previousYTDInterestPaid + '\'' + 
			",accruedInterest = '" + accruedInterest + '\'' + 
			",alternateAccruedInterest = '" + alternateAccruedInterest + '\'' + 
			",amtOfLastIntPd = '" + amtOfLastIntPd + '\'' + 
			"}";
		}
}