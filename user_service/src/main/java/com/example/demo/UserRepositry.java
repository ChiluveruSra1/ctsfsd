package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry extends MongoRepository<User, String> {
//JpaRepository<User, String> {

	/*
	 * List<User> findByItemName(String itemName);
	 * 
	 * List<Item> findByItemPrice(Double itemPrice);
	 */
	
	Optional<User> findByEmail(String email);
}
