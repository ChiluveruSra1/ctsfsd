package com.example.demo;

import java.util.List;

import lombok.Data;

@Data
public class Gallery {
	public int id;
	public List<Object> images;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Object> getImages() {
		return images;
	}
	public void setImages(List<Object> images) {
		this.images = images;
	}
	
	
	
}
