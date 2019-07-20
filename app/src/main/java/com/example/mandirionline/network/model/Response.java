package com.example.mandirionline.network.model;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("cif")
	private Cif cif;

	@SerializedName("Exception")
	private Exception exception;

	public void setCif(Cif cif){
		this.cif = cif;
	}

	public Cif getCif(){
		return cif;
	}

	public void setException(Exception exception){
		this.exception = exception;
	}

	public Exception getException(){
		return exception;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"cif = '" + cif + '\'' + 
			",exception = '" + exception + '\'' + 
			"}";
		}
}