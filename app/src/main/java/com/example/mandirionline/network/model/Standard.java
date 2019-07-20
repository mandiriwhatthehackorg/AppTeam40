package com.example.mandirionline.network.model;

import com.google.gson.annotations.SerializedName;

public class Standard{

	@SerializedName("url")
	private String url;

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"Standard{" + 
			"url = '" + url + '\'' + 
			"}";
		}
}