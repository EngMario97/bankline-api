package com.dio.santander.bankline.api.dto;

import com.dio.santander.bankline.api.model.MovementType;

public class NewMovement {
	private String description;
	private Double value;
	private MovementType type;
	private Integer idAccount;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Integer getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}
	public MovementType getType() {
		return type;
	}
	public void setType(MovementType type) {
		this.type = type;
	}
	
	
	
	
}
