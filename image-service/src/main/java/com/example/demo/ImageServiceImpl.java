package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImageServiceImpl implements ImageService {

	private ImageRepositry imageRepositry;

	@Autowired
	public ImageServiceImpl(ImageRepositry imageRepositry) {
		super();
		this.imageRepositry = imageRepositry;
	}

	@Override
	@Transactional
	public Image createUser(Image image) {
		// TODO Auto-generated method stub
		return imageRepositry.save(image);
	}

	@Override
	@Transactional
	public List<Image> findAll() {
		// TODO Auto-generated method stub
		return imageRepositry.findAll();
	}

	@Override
	  @Transactional
	  public Optional<Image> findById(String id) { 
		return imageRepositry.findById(id);
	}

	@Override
	@Transactional
	public void deleteImages() { 
		imageRepositry.deleteAll();
	}

	@Override
	@Transactional
	public Optional<Image> findByName(String name) {
		// TODO Auto-generated method stub
		return imageRepositry.findByName(name);
	}
	  
	

}
