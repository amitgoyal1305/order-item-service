package com.order.item.service.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.order.item.service.OrderItemUpdateRequest;
import com.order.item.service.entity.OrderItem;
import com.order.item.service.repository.OrderItemRepository;

@Service
public class OrderItemsServices {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	
	
	
	public List<OrderItem> getListOrderItems() {
		return orderItemRepository.findAll();

	}
	
	
	public OrderItem getItemsById(@PathVariable("id") Integer id) {

		return orderItemRepository.findByIdOrProductNameOrProductCode(id, "", "");

	}
	
	
	public OrderItem getItemsByCode(@PathVariable("productcode") String productCode) {
		return orderItemRepository.findByIdOrProductNameOrProductCode(null, null, productCode);

	}
	
	
	@GetMapping("/item/getitembyname/{productname}")
	public OrderItem getItemsByName(@PathVariable("productname") String productName) {
		return orderItemRepository.findByIdOrProductNameOrProductCode(null, productName, null);

	}
	
	
	public void updateItem(OrderItemUpdateRequest orderItemUpdateRequest) {
		OrderItem item = orderItemRepository.findById(orderItemUpdateRequest.getId()).get();
		item.setQuantity(orderItemUpdateRequest.getQuantity());
		orderItemRepository.save(item);
	}

}
