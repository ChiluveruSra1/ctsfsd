package com.example.demo.product;

public class Product {
	private String catogeries;

	public String getCatogeries() {
		return catogeries;
	}

	public void setCatogeries(String catogeries) {
		this.catogeries = catogeries;
	}

	public Product(String catogeries) {
		super();
		this.catogeries = catogeries;
	}
	
}
