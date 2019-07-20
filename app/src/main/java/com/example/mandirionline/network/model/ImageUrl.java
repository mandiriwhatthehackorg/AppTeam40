package com.example.mandirionline.network.model;

import com.google.gson.annotations.SerializedName;

public class ImageUrl{

	@SerializedName("standard")
	private Standard standard;

	@SerializedName("thumbnail")
	private Thumbnail thumbnail;

	@SerializedName("url")
	private String url;

	public void setStandard(Standard standard){
		this.standard = standard;
	}

	public Standard getStandard(){
		return standard;
	}

	public void setThumbnail(Thumbnail thumbnail){
		this.thumbnail = thumbnail;
	}

	public Thumbnail getThumbnail(){
		return thumbnail;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	@Override
 	public String toString(){
		return 
			"ImageUrl{" + 
			"standard = '" + standard + '\'' + 
			",thumbnail = '" + thumbnail + '\'' + 
			",url = '" + url + '\'' + 
			"}";
		}
}