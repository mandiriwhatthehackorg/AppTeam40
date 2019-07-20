package com.example.mandirionline.network.model;

import com.google.gson.annotations.SerializedName;

public class ProductResponse{

	@SerializedName("desc_product")
	private String descProduct;

	@SerializedName("name_merchant")
	private String nameMerchant;

	@SerializedName("subtitle_product")
	private String subtitleProduct;

	@SerializedName("redeem_point")
	private String redeemPoint;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("image_url")
	private ImageUrl imageUrl;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("exp_date")
	private String expDate;

	@SerializedName("id")
	private int id;

	@SerializedName("title_product")
	private String titleProduct;

	public void setDescProduct(String descProduct){
		this.descProduct = descProduct;
	}

	public String getDescProduct(){
		return descProduct;
	}

	public void setNameMerchant(String nameMerchant){
		this.nameMerchant = nameMerchant;
	}

	public String getNameMerchant(){
		return nameMerchant;
	}

	public void setSubtitleProduct(String subtitleProduct){
		this.subtitleProduct = subtitleProduct;
	}

	public String getSubtitleProduct(){
		return subtitleProduct;
	}

	public void setRedeemPoint(String redeemPoint){
		this.redeemPoint = redeemPoint;
	}

	public String getRedeemPoint(){
		return redeemPoint;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setImageUrl(ImageUrl imageUrl){
		this.imageUrl = imageUrl;
	}

	public ImageUrl getImageUrl(){
		return imageUrl;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setExpDate(String expDate){
		this.expDate = expDate;
	}

	public String getExpDate(){
		return expDate;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setTitleProduct(String titleProduct){
		this.titleProduct = titleProduct;
	}

	public String getTitleProduct(){
		return titleProduct;
	}

	@Override
 	public String toString(){
		return 
			"ProductResponse{" + 
			"desc_product = '" + descProduct + '\'' + 
			",name_merchant = '" + nameMerchant + '\'' + 
			",subtitle_product = '" + subtitleProduct + '\'' + 
			",redeem_point = '" + redeemPoint + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",image_url = '" + imageUrl + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",exp_date = '" + expDate + '\'' + 
			",id = '" + id + '\'' + 
			",title_product = '" + titleProduct + '\'' + 
			"}";
		}
}