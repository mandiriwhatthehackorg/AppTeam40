package com.example.mandirionline.network.model.customeraccountnumber;

import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("balance")
	private Balance balance;

	@SerializedName("Exception")
	private Exception exception;

	public void setBalance(Balance balance){
		this.balance = balance;
	}

	public Balance getBalance(){
		return balance;
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
			"balance = '" + balance + '\'' + 
			",exception = '" + exception + '\'' + 
			"}";
		}
}