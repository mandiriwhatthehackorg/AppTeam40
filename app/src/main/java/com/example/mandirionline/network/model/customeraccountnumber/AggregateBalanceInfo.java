package com.example.mandirionline.network.model.customeraccountnumber;
import com.google.gson.annotations.SerializedName;

public class AggregateBalanceInfo{

	@SerializedName("averageCollectedBalancePriorFourthQtr")
	private String averageCollectedBalancePriorFourthQtr;

	@SerializedName("averageLedgerBalancePriorFourthQtr")
	private String averageLedgerBalancePriorFourthQtr;

	@SerializedName("averageCollectedBalancePriorSecondQtr")
	private String averageCollectedBalancePriorSecondQtr;

	@SerializedName("aggregateDaysThisQtr")
	private String aggregateDaysThisQtr;

	@SerializedName("aggregateCollectedBalanceThisQtr")
	private String aggregateCollectedBalanceThisQtr;

	@SerializedName("averageCollectedBalancePriorFirstQtr")
	private String averageCollectedBalancePriorFirstQtr;

	@SerializedName("aggregateLedgerBalanceThisQtr")
	private String aggregateLedgerBalanceThisQtr;

	@SerializedName("averageCollectedBalancePriorThirdQtr")
	private String averageCollectedBalancePriorThirdQtr;

	@SerializedName("averageLedgerBalancePriorThirdQtr")
	private String averageLedgerBalancePriorThirdQtr;

	@SerializedName("averageLedgerBalancePriorSecondQtr")
	private String averageLedgerBalancePriorSecondQtr;

	@SerializedName("averageLedgerBalancePriorFirstQtr")
	private String averageLedgerBalancePriorFirstQtr;

	public void setAverageCollectedBalancePriorFourthQtr(String averageCollectedBalancePriorFourthQtr){
		this.averageCollectedBalancePriorFourthQtr = averageCollectedBalancePriorFourthQtr;
	}

	public String getAverageCollectedBalancePriorFourthQtr(){
		return averageCollectedBalancePriorFourthQtr;
	}

	public void setAverageLedgerBalancePriorFourthQtr(String averageLedgerBalancePriorFourthQtr){
		this.averageLedgerBalancePriorFourthQtr = averageLedgerBalancePriorFourthQtr;
	}

	public String getAverageLedgerBalancePriorFourthQtr(){
		return averageLedgerBalancePriorFourthQtr;
	}

	public void setAverageCollectedBalancePriorSecondQtr(String averageCollectedBalancePriorSecondQtr){
		this.averageCollectedBalancePriorSecondQtr = averageCollectedBalancePriorSecondQtr;
	}

	public String getAverageCollectedBalancePriorSecondQtr(){
		return averageCollectedBalancePriorSecondQtr;
	}

	public void setAggregateDaysThisQtr(String aggregateDaysThisQtr){
		this.aggregateDaysThisQtr = aggregateDaysThisQtr;
	}

	public String getAggregateDaysThisQtr(){
		return aggregateDaysThisQtr;
	}

	public void setAggregateCollectedBalanceThisQtr(String aggregateCollectedBalanceThisQtr){
		this.aggregateCollectedBalanceThisQtr = aggregateCollectedBalanceThisQtr;
	}

	public String getAggregateCollectedBalanceThisQtr(){
		return aggregateCollectedBalanceThisQtr;
	}

	public void setAverageCollectedBalancePriorFirstQtr(String averageCollectedBalancePriorFirstQtr){
		this.averageCollectedBalancePriorFirstQtr = averageCollectedBalancePriorFirstQtr;
	}

	public String getAverageCollectedBalancePriorFirstQtr(){
		return averageCollectedBalancePriorFirstQtr;
	}

	public void setAggregateLedgerBalanceThisQtr(String aggregateLedgerBalanceThisQtr){
		this.aggregateLedgerBalanceThisQtr = aggregateLedgerBalanceThisQtr;
	}

	public String getAggregateLedgerBalanceThisQtr(){
		return aggregateLedgerBalanceThisQtr;
	}

	public void setAverageCollectedBalancePriorThirdQtr(String averageCollectedBalancePriorThirdQtr){
		this.averageCollectedBalancePriorThirdQtr = averageCollectedBalancePriorThirdQtr;
	}

	public String getAverageCollectedBalancePriorThirdQtr(){
		return averageCollectedBalancePriorThirdQtr;
	}

	public void setAverageLedgerBalancePriorThirdQtr(String averageLedgerBalancePriorThirdQtr){
		this.averageLedgerBalancePriorThirdQtr = averageLedgerBalancePriorThirdQtr;
	}

	public String getAverageLedgerBalancePriorThirdQtr(){
		return averageLedgerBalancePriorThirdQtr;
	}

	public void setAverageLedgerBalancePriorSecondQtr(String averageLedgerBalancePriorSecondQtr){
		this.averageLedgerBalancePriorSecondQtr = averageLedgerBalancePriorSecondQtr;
	}

	public String getAverageLedgerBalancePriorSecondQtr(){
		return averageLedgerBalancePriorSecondQtr;
	}

	public void setAverageLedgerBalancePriorFirstQtr(String averageLedgerBalancePriorFirstQtr){
		this.averageLedgerBalancePriorFirstQtr = averageLedgerBalancePriorFirstQtr;
	}

	public String getAverageLedgerBalancePriorFirstQtr(){
		return averageLedgerBalancePriorFirstQtr;
	}

	@Override
 	public String toString(){
		return 
			"AggregateBalanceInfo{" + 
			"averageCollectedBalancePriorFourthQtr = '" + averageCollectedBalancePriorFourthQtr + '\'' + 
			",averageLedgerBalancePriorFourthQtr = '" + averageLedgerBalancePriorFourthQtr + '\'' + 
			",averageCollectedBalancePriorSecondQtr = '" + averageCollectedBalancePriorSecondQtr + '\'' + 
			",aggregateDaysThisQtr = '" + aggregateDaysThisQtr + '\'' + 
			",aggregateCollectedBalanceThisQtr = '" + aggregateCollectedBalanceThisQtr + '\'' + 
			",averageCollectedBalancePriorFirstQtr = '" + averageCollectedBalancePriorFirstQtr + '\'' + 
			",aggregateLedgerBalanceThisQtr = '" + aggregateLedgerBalanceThisQtr + '\'' + 
			",averageCollectedBalancePriorThirdQtr = '" + averageCollectedBalancePriorThirdQtr + '\'' + 
			",averageLedgerBalancePriorThirdQtr = '" + averageLedgerBalancePriorThirdQtr + '\'' + 
			",averageLedgerBalancePriorSecondQtr = '" + averageLedgerBalancePriorSecondQtr + '\'' + 
			",averageLedgerBalancePriorFirstQtr = '" + averageLedgerBalancePriorFirstQtr + '\'' + 
			"}";
		}
}