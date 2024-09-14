package com.model;

public class Menu {
	
	private Long item_Id;
	private String item_Name;
	private int item_Cost;
	private int quantity;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(Long item_Id, String item_Name, int item_Cost, int quantity) {
		super();
		this.item_Id = item_Id;
		this.item_Name = item_Name;
		this.item_Cost = item_Cost;
		this.quantity = quantity;
	}
	public Long getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(Long item_Id) {
		this.item_Id = item_Id;
	}
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
	public int getItem_Cost() {
		return item_Cost;
	}
	public void setItem_Cost(int item_Cost) {
		this.item_Cost = item_Cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
