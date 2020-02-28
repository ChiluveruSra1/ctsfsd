package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepositry extends MongoRepository<Movie, String> {
//JpaRepository<User, String> {

	/*
	 * List<User> findByItemName(String itemName);
	 * 
	 * List<Item> findByItemPrice(Double itemPrice);
	 */
	
	Optional<Movie> findByMovieName(String name);
}
