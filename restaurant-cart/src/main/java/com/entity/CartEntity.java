package com.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class CartEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_Id;

   
   private Long user_Id;
    private int quantity;
    private int restaurant_Id;
    private Long item_Id;
    private Double total_Amount;
    private String items;
	public Long getCart_Id() {
		return cart_Id;
	}
	public void setCart_Id(Long cart_Id) {
		this.cart_Id = cart_Id;
	}
	public Long getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRestaurant_Id() {
		return restaurant_Id;
	}
	public void setRestaurant_Id(int restaurant_Id) {
		this.restaurant_Id = restaurant_Id;
	}
	public Long getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(Long item_Id) {
		this.item_Id = item_Id;
	}
	public Double getTotal_Amount() {
		return total_Amount;
	}
	public void setTotal_Amount(Double total_Amount) {
		this.total_Amount = total_Amount;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public CartEntity(Long cart_Id, Long user_Id, int quantity, int restaurant_Id, Long item_Id, Double total_Amount,
			String items) {
		super();
		this.cart_Id = cart_Id;
		this.user_Id = user_Id;
		this.quantity = quantity;
		this.restaurant_Id = restaurant_Id;
		this.item_Id = item_Id;
		this.total_Amount = total_Amount;
		this.items = items;
	}
	public CartEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
   
}
