package com.order.item.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.item.service.OrderItemUpdateRequest;
import com.order.item.service.entity.OrderItem;
import com.order.item.service.model.OrderItemsServices;

@RestController
@RequestMapping("/order")
public class OrderItemsController {
	@Autowired
	private OrderItemsServices orderItemsServices;

	@GetMapping("/items")
	public List<OrderItem> getListOrderItems() {
		return orderItemsServices.getListOrderItems();

	}

	@GetMapping("/item/{id}")
	public OrderItem getItemsById(@PathVariable("id") Integer id) {

		return orderItemsServices.getItemsById(id);

	}

	@GetMapping("/item/getbycode/{productcode}")
	public OrderItem getItemsByCode(@PathVariable("productcode") String productCode) {
		return orderItemsServices.getItemsByCode(productCode);

	}

	@GetMapping("/item/getitembyname/{productname}")
	public OrderItem getItemsByName(@PathVariable("productname") String productName) {
		return orderItemsServices.getItemsByName(productName);

	}

	@PutMapping("/item/update")
	public ResponseEntity<Object> updateItem(@RequestBody OrderItemUpdateRequest orderItemUpdateRequest) {
		orderItemsServices.updateItem(orderItemUpdateRequest);
		return ResponseEntity.noContent().build();
	}

}
