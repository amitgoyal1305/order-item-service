package com.order.item.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.item.service.entity.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
	
	
	public OrderItem findByIdOrProductNameOrProductCode(Integer id,String productName, String productCode);
	

}
