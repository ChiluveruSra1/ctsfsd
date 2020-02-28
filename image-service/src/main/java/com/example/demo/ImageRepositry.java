package com.example.demo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepositry extends MongoRepository<Image, String> {
//JpaRepository<User, String> {

	/*
	 * List<User> findByItemName(String itemName);
	 * 
	 * List<Item> findByItemPrice(Double itemPrice);
	 */
	
	Optional<Image> findByName(String name);
}
