package com.example.mandirionline.network.model.accountbalanceresponse;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SpecialInstructionInfo{

	@SerializedName("specialInstruction")
	private List<SpecialInstructionItem> specialInstruction;

	public void setSpecialInstruction(List<SpecialInstructionItem> specialInstruction){
		this.specialInstruction = specialInstruction;
	}

	public List<SpecialInstructionItem> getSpecialInstruction(){
		return specialInstruction;
	}

	@Override
 	public String toString(){
		return 
			"SpecialInstructionInfo{" + 
			"specialInstruction = '" + specialInstruction + '\'' + 
			"}";
		}
}