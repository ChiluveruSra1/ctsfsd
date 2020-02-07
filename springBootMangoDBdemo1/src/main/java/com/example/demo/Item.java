package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.demo.product.Product;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "item2")
public class Item {

	@Id
	private String itemId;
	private String itemName;
	private Double itemPrice;
	@JsonFormat(shape = Shape.STRING,pattern = "dd-mm-yyyy")
	@JsonIgnore
	private LocalDateTime mnfgDt;
	@JsonIgnore
	private LocalDateTime updatedDt;
	private Product product;
	
	public Item() {
		super();
	}

	public Item(String itemId, String itemName, Double itemPrice,LocalDateTime mnfgDt,LocalDateTime updatedDt,Product product) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.mnfgDt=mnfgDt;
		this.updatedDt=updatedDt;
		this.product=product;
	}

	public Item(String itemName, double itemPrice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	

	public Item(String itemName, Double itemPrice, LocalDateTime updatedDt,Product product) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.updatedDt = updatedDt;
		this.product=product;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public LocalDateTime getMnfgDt() {
		return mnfgDt;
	}

	public void setMnfgDt(LocalDateTime mnfgDt) {
		this.mnfgDt = mnfgDt;
	}

	public LocalDateTime getUpdatedDt() {
		return updatedDt;
	}

	public void setUpdatedDt(LocalDateTime updatedDt) {
		this.updatedDt = updatedDt;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
