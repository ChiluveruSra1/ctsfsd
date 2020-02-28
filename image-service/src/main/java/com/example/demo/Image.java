package com.example.demo;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Image {

	@Id
	public String id;
	public String name;
	public String url;
}
