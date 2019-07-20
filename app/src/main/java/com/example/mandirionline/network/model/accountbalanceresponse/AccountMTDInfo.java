package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

public class AccountMTDInfo{

	@SerializedName("mtdBeginningAccrual")
	private String mtdBeginningAccrual;

	@SerializedName("mtdAggregateBalance")
	private String mtdAggregateBalance;

	@SerializedName("mtdReturnedDebitAmount")
	private String mtdReturnedDebitAmount;

	@SerializedName("mtdReturnedDebitCount")
	private String mtdReturnedDebitCount;

	@SerializedName("mtdODInterestCharged")
	private String mtdODInterestCharged;

	@SerializedName("mtdReturnedCreditCount")
	private String mtdReturnedCreditCount;

	@SerializedName("mtdServiceCharge")
	private String mtdServiceCharge;

	@SerializedName("mtdFeesPaid")
	private String mtdFeesPaid;

	@SerializedName("mtdReturnedCreditAmount")
	private String mtdReturnedCreditAmount;

	@SerializedName("mtdInterestPaid")
	private String mtdInterestPaid;

	@SerializedName("mtdAggregateDays")
	private String mtdAggregateDays;

	public void setMtdBeginningAccrual(String mtdBeginningAccrual){
		this.mtdBeginningAccrual = mtdBeginningAccrual;
	}

	public String getMtdBeginningAccrual(){
		return mtdBeginningAccrual;
	}

	public void setMtdAggregateBalance(String mtdAggregateBalance){
		this.mtdAggregateBalance = mtdAggregateBalance;
	}

	public String getMtdAggregateBalance(){
		return mtdAggregateBalance;
	}

	public void setMtdReturnedDebitAmount(String mtdReturnedDebitAmount){
		this.mtdReturnedDebitAmount = mtdReturnedDebitAmount;
	}

	public String getMtdReturnedDebitAmount(){
		return mtdReturnedDebitAmount;
	}

	public void setMtdReturnedDebitCount(String mtdReturnedDebitCount){
		this.mtdReturnedDebitCount = mtdReturnedDebitCount;
	}

	public String getMtdReturnedDebitCount(){
		return mtdReturnedDebitCount;
	}

	public void setMtdODInterestCharged(String mtdODInterestCharged){
		this.mtdODInterestCharged = mtdODInterestCharged;
	}

	public String getMtdODInterestCharged(){
		return mtdODInterestCharged;
	}

	public void setMtdReturnedCreditCount(String mtdReturnedCreditCount){
		this.mtdReturnedCreditCount = mtdReturnedCreditCount;
	}

	public String getMtdReturnedCreditCount(){
		return mtdReturnedCreditCount;
	}

	public void setMtdServiceCharge(String mtdServiceCharge){
		this.mtdServiceCharge = mtdServiceCharge;
	}

	public String getMtdServiceCharge(){
		return mtdServiceCharge;
	}

	public void setMtdFeesPaid(String mtdFeesPaid){
		this.mtdFeesPaid = mtdFeesPaid;
	}

	public String getMtdFeesPaid(){
		return mtdFeesPaid;
	}

	public void setMtdReturnedCreditAmount(String mtdReturnedCreditAmount){
		this.mtdReturnedCreditAmount = mtdReturnedCreditAmount;
	}

	public String getMtdReturnedCreditAmount(){
		return mtdReturnedCreditAmount;
	}

	public void setMtdInterestPaid(String mtdInterestPaid){
		this.mtdInterestPaid = mtdInterestPaid;
	}

	public String getMtdInterestPaid(){
		return mtdInterestPaid;
	}

	public void setMtdAggregateDays(String mtdAggregateDays){
		this.mtdAggregateDays = mtdAggregateDays;
	}

	public String getMtdAggregateDays(){
		return mtdAggregateDays;
	}

	@Override
 	public String toString(){
		return 
			"AccountMTDInfo{" + 
			"mtdBeginningAccrual = '" + mtdBeginningAccrual + '\'' + 
			",mtdAggregateBalance = '" + mtdAggregateBalance + '\'' + 
			",mtdReturnedDebitAmount = '" + mtdReturnedDebitAmount + '\'' + 
			",mtdReturnedDebitCount = '" + mtdReturnedDebitCount + '\'' + 
			",mtdODInterestCharged = '" + mtdODInterestCharged + '\'' + 
			",mtdReturnedCreditCount = '" + mtdReturnedCreditCount + '\'' + 
			",mtdServiceCharge = '" + mtdServiceCharge + '\'' + 
			",mtdFeesPaid = '" + mtdFeesPaid + '\'' + 
			",mtdReturnedCreditAmount = '" + mtdReturnedCreditAmount + '\'' + 
			",mtdInterestPaid = '" + mtdInterestPaid + '\'' + 
			",mtdAggregateDays = '" + mtdAggregateDays + '\'' + 
			"}";
		}
}