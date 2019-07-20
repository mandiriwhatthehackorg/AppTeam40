package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

public class AccountAmountDetails{

	@SerializedName("totalOCPAmount")
	private String totalOCPAmount;

	@SerializedName("totalODOCAmount")
	private String totalODOCAmount;

	@SerializedName("totalSuspenseAmount")
	private String totalSuspenseAmount;

	@SerializedName("totalIBTAmount")
	private String totalIBTAmount;

	@SerializedName("totalOCAmount")
	private String totalOCAmount;

	@SerializedName("totalMCAmount")
	private String totalMCAmount;

	@SerializedName("holdAmount")
	private String holdAmount;

	@SerializedName("totalEXTRAAmount")
	private String totalEXTRAAmount;

	@SerializedName("totalLLCAmount")
	private String totalLLCAmount;

	@SerializedName("floatDrawingAmount")
	private String floatDrawingAmount;

	public void setTotalOCPAmount(String totalOCPAmount){
		this.totalOCPAmount = totalOCPAmount;
	}

	public String getTotalOCPAmount(){
		return totalOCPAmount;
	}

	public void setTotalODOCAmount(String totalODOCAmount){
		this.totalODOCAmount = totalODOCAmount;
	}

	public String getTotalODOCAmount(){
		return totalODOCAmount;
	}

	public void setTotalSuspenseAmount(String totalSuspenseAmount){
		this.totalSuspenseAmount = totalSuspenseAmount;
	}

	public String getTotalSuspenseAmount(){
		return totalSuspenseAmount;
	}

	public void setTotalIBTAmount(String totalIBTAmount){
		this.totalIBTAmount = totalIBTAmount;
	}

	public String getTotalIBTAmount(){
		return totalIBTAmount;
	}

	public void setTotalOCAmount(String totalOCAmount){
		this.totalOCAmount = totalOCAmount;
	}

	public String getTotalOCAmount(){
		return totalOCAmount;
	}

	public void setTotalMCAmount(String totalMCAmount){
		this.totalMCAmount = totalMCAmount;
	}

	public String getTotalMCAmount(){
		return totalMCAmount;
	}

	public void setHoldAmount(String holdAmount){
		this.holdAmount = holdAmount;
	}

	public String getHoldAmount(){
		return holdAmount;
	}

	public void setTotalEXTRAAmount(String totalEXTRAAmount){
		this.totalEXTRAAmount = totalEXTRAAmount;
	}

	public String getTotalEXTRAAmount(){
		return totalEXTRAAmount;
	}

	public void setTotalLLCAmount(String totalLLCAmount){
		this.totalLLCAmount = totalLLCAmount;
	}

	public String getTotalLLCAmount(){
		return totalLLCAmount;
	}

	public void setFloatDrawingAmount(String floatDrawingAmount){
		this.floatDrawingAmount = floatDrawingAmount;
	}

	public String getFloatDrawingAmount(){
		return floatDrawingAmount;
	}

	@Override
 	public String toString(){
		return 
			"AccountAmountDetails{" + 
			"totalOCPAmount = '" + totalOCPAmount + '\'' + 
			",totalODOCAmount = '" + totalODOCAmount + '\'' + 
			",totalSuspenseAmount = '" + totalSuspenseAmount + '\'' + 
			",totalIBTAmount = '" + totalIBTAmount + '\'' + 
			",totalOCAmount = '" + totalOCAmount + '\'' + 
			",totalMCAmount = '" + totalMCAmount + '\'' + 
			",holdAmount = '" + holdAmount + '\'' + 
			",totalEXTRAAmount = '" + totalEXTRAAmount + '\'' + 
			",totalLLCAmount = '" + totalLLCAmount + '\'' + 
			",floatDrawingAmount = '" + floatDrawingAmount + '\'' + 
			"}";
		}
}