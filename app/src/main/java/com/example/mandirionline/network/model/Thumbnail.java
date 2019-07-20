package com.example.mandirionline.network.model;

import com.google.gson.annotations.SerializedName;

public class Thumbnail{

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
			"Thumbnail{" + 
			"url = '" + url + '\'' + 
			"}";
		}
}