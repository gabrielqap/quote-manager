package com.stockmanager.project.model;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

@Entity
public class StockQuote {
	@Id
	@NotNull
	private String id;
	
	@NotNull
	private String value;
	
	@NotNull
	private LocalDate localDate;
	
	public StockQuote() {
	}
	
	public StockQuote(@NotNull String id, @NotNull String value, @NotNull LocalDate localDate) {
		this.id = id;
		this.value = value;
		this.localDate = localDate;
	}
	
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

}
