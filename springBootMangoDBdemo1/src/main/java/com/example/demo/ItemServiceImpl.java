package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemServiceImpl implements ItemService{
	
	private ItemRepositry itemRepositry;
	
	@Autowired
	public ItemServiceImpl(ItemRepositry itemRepositry) {
		super();
		this.itemRepositry = itemRepositry;
	}

	@Override
	@Transactional
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepositry.save(item);
	}

	@Override
	@Transactional
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		return itemRepositry.findAll();
	}

	@Override
	@Transactional
	public Optional<Item> findById(String id) {
		// TODO Auto-generated method stub
		return itemRepositry.findById(id);
	}
	
	@Override
	@Transactional
	public List<Item> findName(String itemName) {
		return itemRepositry.findByItemName(itemName);
	}
	
	@Override
	@Transactional
	public List<Item> findPrice(Double itemPrice) {
		return itemRepositry.findByItemPrice(itemPrice);
	}
	
	@Override
	@Transactional
	public void deleteItemById(String itemId) {
		itemRepositry.deleteById(itemId);
	}

	@Override
	@Transactional
	public void deleteItems() {
		itemRepositry.deleteAll();
	}

	
	
	

}
