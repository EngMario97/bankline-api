package com.dio.santander.bankline.api.model;

import java.time.LocalDateTime;

public class Movement {
	private Integer id;
	private LocalDateTime datetime;
	private String description;
	private Double value;
	private MovementType type;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
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
	public MovementType getType() {
		return type;
	}
	public void setType(MovementType type) {
		this.type = type;
	}
	
	

}
