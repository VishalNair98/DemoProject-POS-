package com.cg.pos.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizza")
public class PizzaDetails {
	@Id
	private int itemId;
	private int storeId;
	private int quantity;

	private double price;
	@Column(name = "pizzaname")
	private String itemName;

	public PizzaDetails(int itemId, int storeId, int quantity, double price, String itemName) {
		super();
		this.itemId = itemId;
		storeId = storeId;
		this.quantity = quantity;
		this.price = price;
		this.itemName = itemName;
	}

	public PizzaDetails() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the storeId
	 */
	public int getStoreId() {
		return storeId;
	}

	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(int storeId) {
		storeId = storeId;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "PizzaDetails [itemId=" + itemId + ", StoreId=" + storeId + ", quantity=" + quantity + ", price=" + price
				+ ", itemName=" + itemName + "]";
	}

}
