package com.example.mandirionline.network.model.customeraccountnumber;

import com.google.gson.annotations.SerializedName;

public class OverDraftCycleInfo{

	@SerializedName("timesODThisCycle")
	private String timesODThisCycle;

	@SerializedName("timesODThisQtr")
	private String timesODThisQtr;

	@SerializedName("timesOD3rdQtr")
	private String timesOD3rdQtr;

	@SerializedName("timesOD2ndQtr")
	private String timesOD2ndQtr;

	@SerializedName("timesOD4thQtr")
	private String timesOD4thQtr;

	@SerializedName("timesODLifeToDate")
	private String timesODLifeToDate;

	@SerializedName("timesODLastYear")
	private String timesODLastYear;

	public void setTimesODThisCycle(String timesODThisCycle){
		this.timesODThisCycle = timesODThisCycle;
	}

	public String getTimesODThisCycle(){
		return timesODThisCycle;
	}

	public void setTimesODThisQtr(String timesODThisQtr){
		this.timesODThisQtr = timesODThisQtr;
	}

	public String getTimesODThisQtr(){
		return timesODThisQtr;
	}

	public void setTimesOD3rdQtr(String timesOD3rdQtr){
		this.timesOD3rdQtr = timesOD3rdQtr;
	}

	public String getTimesOD3rdQtr(){
		return timesOD3rdQtr;
	}

	public void setTimesOD2ndQtr(String timesOD2ndQtr){
		this.timesOD2ndQtr = timesOD2ndQtr;
	}

	public String getTimesOD2ndQtr(){
		return timesOD2ndQtr;
	}

	public void setTimesOD4thQtr(String timesOD4thQtr){
		this.timesOD4thQtr = timesOD4thQtr;
	}

	public String getTimesOD4thQtr(){
		return timesOD4thQtr;
	}

	public void setTimesODLifeToDate(String timesODLifeToDate){
		this.timesODLifeToDate = timesODLifeToDate;
	}

	public String getTimesODLifeToDate(){
		return timesODLifeToDate;
	}

	public void setTimesODLastYear(String timesODLastYear){
		this.timesODLastYear = timesODLastYear;
	}

	public String getTimesODLastYear(){
		return timesODLastYear;
	}

	@Override
 	public String toString(){
		return 
			"OverDraftCycleInfo{" + 
			"timesODThisCycle = '" + timesODThisCycle + '\'' + 
			",timesODThisQtr = '" + timesODThisQtr + '\'' + 
			",timesOD3rdQtr = '" + timesOD3rdQtr + '\'' + 
			",timesOD2ndQtr = '" + timesOD2ndQtr + '\'' + 
			",timesOD4thQtr = '" + timesOD4thQtr + '\'' + 
			",timesODLifeToDate = '" + timesODLifeToDate + '\'' + 
			",timesODLastYear = '" + timesODLastYear + '\'' + 
			"}";
		}
}