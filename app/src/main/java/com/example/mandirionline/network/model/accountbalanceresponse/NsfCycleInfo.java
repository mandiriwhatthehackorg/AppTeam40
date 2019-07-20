package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

public class NsfCycleInfo{

	@SerializedName("noNSFThisQtr")
	private String noNSFThisQtr;

	@SerializedName("noNSthQtr")
	private String noNSthQtr;

	@SerializedName("noNSFThisCycle")
	private String noNSFThisCycle;

	@SerializedName("noNSF3rdQtr")
	private String noNSF3rdQtr;

	@SerializedName("noNSFLastYear")
	private String noNSFLastYear;

	@SerializedName("noNSFLifeToDate")
	private String noNSFLifeToDate;

	@SerializedName("noNSF2ndQtr")
	private String noNSF2ndQtr;

	public void setNoNSFThisQtr(String noNSFThisQtr){
		this.noNSFThisQtr = noNSFThisQtr;
	}

	public String getNoNSFThisQtr(){
		return noNSFThisQtr;
	}

	public void setNoNSthQtr(String noNSthQtr){
		this.noNSthQtr = noNSthQtr;
	}

	public String getNoNSthQtr(){
		return noNSthQtr;
	}

	public void setNoNSFThisCycle(String noNSFThisCycle){
		this.noNSFThisCycle = noNSFThisCycle;
	}

	public String getNoNSFThisCycle(){
		return noNSFThisCycle;
	}

	public void setNoNSF3rdQtr(String noNSF3rdQtr){
		this.noNSF3rdQtr = noNSF3rdQtr;
	}

	public String getNoNSF3rdQtr(){
		return noNSF3rdQtr;
	}

	public void setNoNSFLastYear(String noNSFLastYear){
		this.noNSFLastYear = noNSFLastYear;
	}

	public String getNoNSFLastYear(){
		return noNSFLastYear;
	}

	public void setNoNSFLifeToDate(String noNSFLifeToDate){
		this.noNSFLifeToDate = noNSFLifeToDate;
	}

	public String getNoNSFLifeToDate(){
		return noNSFLifeToDate;
	}

	public void setNoNSF2ndQtr(String noNSF2ndQtr){
		this.noNSF2ndQtr = noNSF2ndQtr;
	}

	public String getNoNSF2ndQtr(){
		return noNSF2ndQtr;
	}

	@Override
 	public String toString(){
		return 
			"NsfCycleInfo{" + 
			"noNSFThisQtr = '" + noNSFThisQtr + '\'' + 
			",noNSthQtr = '" + noNSthQtr + '\'' + 
			",noNSFThisCycle = '" + noNSFThisCycle + '\'' + 
			",noNSF3rdQtr = '" + noNSF3rdQtr + '\'' + 
			",noNSFLastYear = '" + noNSFLastYear + '\'' + 
			",noNSFLifeToDate = '" + noNSFLifeToDate + '\'' + 
			",noNSF2ndQtr = '" + noNSF2ndQtr + '\'' + 
			"}";
		}
}