package com.order.item.service.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.item.service.OrderItemUpdateRequest;
import com.order.item.service.entity.OrderItem;
import com.order.item.service.repository.OrderItemRepository;

@Service
@Transactional
public class OrderItemsServicesImpl  implements OrderItemsServices{
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	
	
	
	public List<OrderItem> getListOrderItems() {
		return orderItemRepository.findAll();

	}
	
	
	public OrderItem getItemsById(Integer id) {

		return orderItemRepository.findByIdOrProductNameOrProductCode(id, "", "");

	}
	
	
	public OrderItem getItemsByCode(String productCode) {
		return orderItemRepository.findByIdOrProductNameOrProductCode(null, null, productCode);

	}
	
	
	
	public OrderItem getItemsByName(String productName) {
		return orderItemRepository.findByIdOrProductNameOrProductCode(null, productName, null);

	}
	
	
	public void updateItem(OrderItemUpdateRequest orderItemUpdateRequest) {
		OrderItem item = orderItemRepository.findById(orderItemUpdateRequest.getId()).get();
		item.setQuantity(orderItemUpdateRequest.getQuantity());
		orderItemRepository.save(item);
	}

}
