package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface ItemService {

	public Item createItem(Item item);
	public List<Item> findAll();
	public Optional<Item> findById(String id);
	List<Item> findName(String itemName);
	void deleteItemById(String itemId);
	void deleteItems();
	List<Item> findPrice(Double itemPrice);

}
