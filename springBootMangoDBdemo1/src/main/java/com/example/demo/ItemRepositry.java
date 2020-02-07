package com.example.demo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepositry extends MongoRepository<Item, String> {

	List<Item> findByItemName(String itemName);

	List<Item> findByItemPrice(Double itemPrice);

}
