package com.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class CartRequest {
	
	private Long item_Id;
	private int quantity;
	public Long getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(Long item_Id) {
		this.item_Id = item_Id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
