package com.order.item.service;

public class OrderItemUpdateRequest {

	int id;
	int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "OrderItemUpdateRequest [id=" + id + ", quantity=" + quantity + "]";
	}

}
