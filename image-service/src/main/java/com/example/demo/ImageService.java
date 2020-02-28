package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface ImageService {

	public Image createUser(Image image);

	List<Image> findAll();

	public Optional<Image> findById(String id);

	public void deleteImages();

	public Optional<Image> findByName(String name);

}
