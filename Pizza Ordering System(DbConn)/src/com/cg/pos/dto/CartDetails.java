/**
 * 
 */
package com.cg.pos.dto;

/**
 * @author trainee
 *
 */
public class CartDetails {
	private int cartId;
	private String pizzaName;
	private int quantity;
	private double cost;

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getCartId() {
		return cartId;
	}
	
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
    public String toString() {
		return cartId+" "+cost;
    	
    }
}
