/**
 * 
 */
package com.cg.pos.dto;

/**
 * @author trainee
 *
 */
public class PizzaDetails {
	private String addOns;
	private String itemId;
	private String itemName;
	private int quantity;
	private double price;
	private String StoreId;

//		public PizzaDetails(String itemId, String itemName, int quantity, double pizzaCost, String StoreId) {
//
//		this.itemId = itemId;
//		this.itemName = itemName;
//		this.quantity = quantity;
//		this.pizzaCost = pizzaCost;
//		this.StoreId = StoreId;
//
//}

	public String getItemId() {
		return itemId;
	}

	public String setItemId(String itemId) {
		return this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStoreId() {
		return StoreId;
	}

	public void setStoreId(String StoreId) {
		this.StoreId = StoreId;
	}

	public String getAddOns() {
		return addOns;
	}

	public void setAddOns(String addOns) {
		this.addOns = addOns;
	}

	public String toString() {
		return StoreId+ " "+" " + itemId +" " + itemName + " "+ quantity +" "+ price+ " "+ addOns;
	}
}
