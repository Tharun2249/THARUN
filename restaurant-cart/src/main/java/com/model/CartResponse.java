package com.model;

import java.util.List;

public class CartResponse {
	private Long user_Id;
	private Long cart_Id;
	private Integer total_Items;
	private Double total_Costs;
	private List<Menu> food_items;
	public CartResponse(Long user_Id, Long cart_Id, Integer total_Items, Double total_Costs, List<Menu> food_items) {
		
	}
	public CartResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}
	public Long getCart_Id() {
		return cart_Id;
	}
	public void setCart_Id(Long cart_Id) {
		this.cart_Id = cart_Id;
	}
	public Integer getTotal_Items() {
		return total_Items;
	}
	public void setTotal_Items(Integer total_Items) {
		this.total_Items = total_Items;
	}
	public Double getTotal_Costs() {
		return total_Costs;
	}
	public void setTotal_Costs(Double total_Costs) {
		this.total_Costs = total_Costs;
	}
	public List<Menu> getFood_items() {
		return food_items;
	}
	public void setFood_items(List<Menu> food_items) {
		this.food_items = food_items;
	}
	
	
	
}
