package com.order.item.service.model;

import java.util.List;

import com.order.item.service.OrderItemUpdateRequest;
import com.order.item.service.entity.OrderItem;

public interface OrderItemsServices {
	
	public List<OrderItem> getListOrderItems();
	
	public OrderItem getItemsById(Integer id);
	
	public OrderItem getItemsByCode(String productCode);
	
	public OrderItem getItemsByName(String productName);
	
	public void updateItem(OrderItemUpdateRequest orderItemUpdateRequest);
	
	

}
