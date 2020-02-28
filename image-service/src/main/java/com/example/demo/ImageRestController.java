package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/image")
public class ImageRestController {
	private ImageService imageService;

	@Autowired
	public ImageRestController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}

	@PostMapping("/create")
	public Image createUser(@RequestBody Image image) {
		return imageService.createUser(image);
	}

	@GetMapping("/all")
	public List<Image> findAll() {
		return imageService.findAll();
	}

	@GetMapping("/id/{id}")
	public Optional<Image> findById(@PathVariable String id) { 
		return imageService.findById(id);
	}
	
	@GetMapping("/name/{name}")
	public Optional<Image> findByMovieName(@PathVariable String name) { 
		return imageService.findByName(name);
	}
	  
	@DeleteMapping("/deleteall")
	void deleteImages() {
		imageService.deleteImages();
	}

}
