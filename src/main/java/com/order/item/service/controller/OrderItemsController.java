package com.order.item.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.order.item.service.OrderItemUpdateRequest;
import com.order.item.service.entity.OrderItem;
import com.order.item.service.repository.OrderItemRepository;



@RestController
public class OrderItemsController {
	@Autowired
	private OrderItemRepository orderItemRepository;

	@GetMapping("/order-items")
	public List<OrderItem> getListOrderItems() {
		return orderItemRepository.findAll();

	}

	@GetMapping("/itembyid/{id}")
	public OrderItem getItemsById(@PathVariable("id") Integer id) {

		return orderItemRepository.findByIdOrProductNameOrProductCode(id, "", "");

	}

	@GetMapping("/itembycode/{productCode}")
	public OrderItem getItemsByCode(@PathVariable("productCode") String productCode) {
		return orderItemRepository.findByIdOrProductNameOrProductCode(null, null, productCode);

	}

	@GetMapping("/itembyname/{productName}")
	public OrderItem getItemsByName(@PathVariable("productName") String productName) {
		return orderItemRepository.findByIdOrProductNameOrProductCode(null, productName, null);

	}
	
	@PutMapping("/updateitem")
	public  ResponseEntity<Object> updateItem(@RequestBody OrderItemUpdateRequest orderItemUpdateRequest){
		
		System.err.println(orderItemUpdateRequest.toString());
		OrderItem item = orderItemRepository.findById(orderItemUpdateRequest.getId()).get();
		item.setQuantity(orderItemUpdateRequest.getQuantity());
		orderItemRepository.save(item);
		return ResponseEntity.noContent().build();
	}
	
}
