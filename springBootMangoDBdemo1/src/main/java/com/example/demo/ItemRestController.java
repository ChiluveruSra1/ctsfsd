package com.example.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.execptionHandlers.ItemNotFoundException;
import com.example.demo.execptionHandlers.ItemError;

@RestController
@RequestMapping("/item")
public class ItemRestController {
	private ItemService itemService;

	@Autowired
	public ItemRestController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}

	@PostMapping("/create")
	public Item createItem(@RequestBody Item item) {
		item.setMnfgDt(LocalDateTime.now());
		item.setUpdatedDt(LocalDateTime.now());
		return itemService.createItem(item);
	}
	
	@PutMapping("/update")
	public Item updateItem(@RequestBody Item item)	{	
		item.setUpdatedDt(LocalDateTime.now());
		return itemService.createItem(item);
	}

	@GetMapping("/all")
	public List<Item> findAll() {
		return itemService.findAll();
	}

	@GetMapping("/id/{itemId}")
	public Optional<Item> findById(@PathVariable String itemId) {
	return itemService.findById(itemId);
		/*
		 * if (item.isPresent()) return item; else { throw new
		 * ItemNotFoundException("Item not found with id: " + itemId); }
		 */
	//return item;
	}

	@GetMapping("/name/{itemName}")
	List<Item> findName(@PathVariable String itemName) {
		//List<Item> item = itemService.findName(itemName);
		return itemService.findName(itemName);
		//if (!item.isEmpty())
		//	return item;
		//else {
		//	throw new ItemNotFoundException("Item not found with name: " + itemName);
		//}
	}

	@GetMapping("/price/{itemPrice}")
	List<Item> findPrice(@PathVariable Double itemPrice) {
		List<Item> item = itemService.findPrice(itemPrice);
		if (!item.isEmpty())
			return item;
		else {
			throw new ItemNotFoundException("Item not found with price: " + itemPrice);
		}
	}

	@DeleteMapping("/delete/{itemId}")
	void deleteItemById(@PathVariable String itemId) {
		itemService.deleteItemById(itemId);
	}

	@DeleteMapping("/deleteall")
	void deleteItems() {
		itemService.deleteItems();
	}

	@ExceptionHandler
	public ResponseEntity<ItemError> error1(ItemNotFoundException ide) {
		ItemError error = new ItemError();
		error.setMessage(ide.getMessage());
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setErrorTime(LocalDateTime.now());
		return new ResponseEntity<ItemError>(error, HttpStatus.NOT_FOUND);

	}

	@ExceptionHandler
	public ResponseEntity<ItemError> error2(Exception e) {
		ItemError error = new ItemError();
		error.setMessage(e.getMessage());
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setErrorTime(LocalDateTime.now());
		return new ResponseEntity<ItemError>(error, HttpStatus.BAD_REQUEST);

	}

}
