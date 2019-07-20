package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

public class AccountRateInfo{

	@SerializedName("interestRate")
	private String interestRate;

	@SerializedName("rateReviewTermCode")
	private String rateReviewTermCode;

	@SerializedName("rateCeiling")
	private String rateCeiling;

	@SerializedName("odRateFloor")
	private String odRateFloor;

	@SerializedName("rateFloor")
	private String rateFloor;

	@SerializedName("odRateVariance")
	private String odRateVariance;

	@SerializedName("rateReviewTerm")
	private String rateReviewTerm;

	@SerializedName("rateReviewDate")
	private String rateReviewDate;

	@SerializedName("odInterestRate")
	private String odInterestRate;

	@SerializedName("odRateVarianceCode")
	private String odRateVarianceCode;

	@SerializedName("odRateReviewTerm")
	private String odRateReviewTerm;

	@SerializedName("acctTierRateNumber")
	private String acctTierRateNumber;

	@SerializedName("odRateReviewTermCode")
	private String odRateReviewTermCode;

	@SerializedName("rateVariance")
	private String rateVariance;

	@SerializedName("rateVarianceCode")
	private String rateVarianceCode;

	@SerializedName("odRateCeiling")
	private String odRateCeiling;

	@SerializedName("odRateReviewDate")
	private String odRateReviewDate;

	public void setInterestRate(String interestRate){
		this.interestRate = interestRate;
	}

	public String getInterestRate(){
		return interestRate;
	}

	public void setRateReviewTermCode(String rateReviewTermCode){
		this.rateReviewTermCode = rateReviewTermCode;
	}

	public String getRateReviewTermCode(){
		return rateReviewTermCode;
	}

	public void setRateCeiling(String rateCeiling){
		this.rateCeiling = rateCeiling;
	}

	public String getRateCeiling(){
		return rateCeiling;
	}

	public void setOdRateFloor(String odRateFloor){
		this.odRateFloor = odRateFloor;
	}

	public String getOdRateFloor(){
		return odRateFloor;
	}

	public void setRateFloor(String rateFloor){
		this.rateFloor = rateFloor;
	}

	public String getRateFloor(){
		return rateFloor;
	}

	public void setOdRateVariance(String odRateVariance){
		this.odRateVariance = odRateVariance;
	}

	public String getOdRateVariance(){
		return odRateVariance;
	}

	public void setRateReviewTerm(String rateReviewTerm){
		this.rateReviewTerm = rateReviewTerm;
	}

	public String getRateReviewTerm(){
		return rateReviewTerm;
	}

	public void setRateReviewDate(String rateReviewDate){
		this.rateReviewDate = rateReviewDate;
	}

	public String getRateReviewDate(){
		return rateReviewDate;
	}

	public void setOdInterestRate(String odInterestRate){
		this.odInterestRate = odInterestRate;
	}

	public String getOdInterestRate(){
		return odInterestRate;
	}

	public void setOdRateVarianceCode(String odRateVarianceCode){
		this.odRateVarianceCode = odRateVarianceCode;
	}

	public String getOdRateVarianceCode(){
		return odRateVarianceCode;
	}

	public void setOdRateReviewTerm(String odRateReviewTerm){
		this.odRateReviewTerm = odRateReviewTerm;
	}

	public String getOdRateReviewTerm(){
		return odRateReviewTerm;
	}

	public void setAcctTierRateNumber(String acctTierRateNumber){
		this.acctTierRateNumber = acctTierRateNumber;
	}

	public String getAcctTierRateNumber(){
		return acctTierRateNumber;
	}

	public void setOdRateReviewTermCode(String odRateReviewTermCode){
		this.odRateReviewTermCode = odRateReviewTermCode;
	}

	public String getOdRateReviewTermCode(){
		return odRateReviewTermCode;
	}

	public void setRateVariance(String rateVariance){
		this.rateVariance = rateVariance;
	}

	public String getRateVariance(){
		return rateVariance;
	}

	public void setRateVarianceCode(String rateVarianceCode){
		this.rateVarianceCode = rateVarianceCode;
	}

	public String getRateVarianceCode(){
		return rateVarianceCode;
	}

	public void setOdRateCeiling(String odRateCeiling){
		this.odRateCeiling = odRateCeiling;
	}

	public String getOdRateCeiling(){
		return odRateCeiling;
	}

	public void setOdRateReviewDate(String odRateReviewDate){
		this.odRateReviewDate = odRateReviewDate;
	}

	public String getOdRateReviewDate(){
		return odRateReviewDate;
	}

	@Override
 	public String toString(){
		return 
			"AccountRateInfo{" + 
			"interestRate = '" + interestRate + '\'' + 
			",rateReviewTermCode = '" + rateReviewTermCode + '\'' + 
			",rateCeiling = '" + rateCeiling + '\'' + 
			",odRateFloor = '" + odRateFloor + '\'' + 
			",rateFloor = '" + rateFloor + '\'' + 
			",odRateVariance = '" + odRateVariance + '\'' + 
			",rateReviewTerm = '" + rateReviewTerm + '\'' + 
			",rateReviewDate = '" + rateReviewDate + '\'' + 
			",odInterestRate = '" + odInterestRate + '\'' + 
			",odRateVarianceCode = '" + odRateVarianceCode + '\'' + 
			",odRateReviewTerm = '" + odRateReviewTerm + '\'' + 
			",acctTierRateNumber = '" + acctTierRateNumber + '\'' + 
			",odRateReviewTermCode = '" + odRateReviewTermCode + '\'' + 
			",rateVariance = '" + rateVariance + '\'' + 
			",rateVarianceCode = '" + rateVarianceCode + '\'' + 
			",odRateCeiling = '" + odRateCeiling + '\'' + 
			",odRateReviewDate = '" + odRateReviewDate + '\'' + 
			"}";
		}
}