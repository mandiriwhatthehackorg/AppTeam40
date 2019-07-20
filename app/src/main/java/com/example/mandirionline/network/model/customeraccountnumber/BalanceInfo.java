package com.example.mandirionline.network.model.customeraccountnumber;

import com.google.gson.annotations.SerializedName;

public class BalanceInfo{

	@SerializedName("yesterdayLedgerBalance")
	private String yesterdayLedgerBalance;

	@SerializedName("previousStatementBalance")
	private String previousStatementBalance;

	@SerializedName("ledgerBalance")
	private String ledgerBalance;

	@SerializedName("minimumBalance")
	private String minimumBalance;

	@SerializedName("prevYearEndLedgerBalance")
	private String prevYearEndLedgerBalance;

	@SerializedName("maximumBalance")
	private String maximumBalance;

	@SerializedName("collectedBalance")
	private String collectedBalance;

	public void setYesterdayLedgerBalance(String yesterdayLedgerBalance){
		this.yesterdayLedgerBalance = yesterdayLedgerBalance;
	}

	public String getYesterdayLedgerBalance(){
		return yesterdayLedgerBalance;
	}

	public void setPreviousStatementBalance(String previousStatementBalance){
		this.previousStatementBalance = previousStatementBalance;
	}

	public String getPreviousStatementBalance(){
		return previousStatementBalance;
	}

	public void setLedgerBalance(String ledgerBalance){
		this.ledgerBalance = ledgerBalance;
	}

	public String getLedgerBalance(){
		return ledgerBalance;
	}

	public void setMinimumBalance(String minimumBalance){
		this.minimumBalance = minimumBalance;
	}

	public String getMinimumBalance(){
		return minimumBalance;
	}

	public void setPrevYearEndLedgerBalance(String prevYearEndLedgerBalance){
		this.prevYearEndLedgerBalance = prevYearEndLedgerBalance;
	}

	public String getPrevYearEndLedgerBalance(){
		return prevYearEndLedgerBalance;
	}

	public void setMaximumBalance(String maximumBalance){
		this.maximumBalance = maximumBalance;
	}

	public String getMaximumBalance(){
		return maximumBalance;
	}

	public void setCollectedBalance(String collectedBalance){
		this.collectedBalance = collectedBalance;
	}

	public String getCollectedBalance(){
		return collectedBalance;
	}

	@Override
 	public String toString(){
		return 
			"BalanceInfo{" + 
			"yesterdayLedgerBalance = '" + yesterdayLedgerBalance + '\'' + 
			",previousStatementBalance = '" + previousStatementBalance + '\'' + 
			",ledgerBalance = '" + ledgerBalance + '\'' + 
			",minimumBalance = '" + minimumBalance + '\'' + 
			",prevYearEndLedgerBalance = '" + prevYearEndLedgerBalance + '\'' + 
			",maximumBalance = '" + maximumBalance + '\'' + 
			",collectedBalance = '" + collectedBalance + '\'' + 
			"}";
		}
}