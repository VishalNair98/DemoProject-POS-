package com.cg.pos.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="cart")
public class CartDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cartid")
	@SequenceGenerator(name = "cartid", sequenceName = "cartid", initialValue = 10000, allocationSize = 1)
	private int cartId;
	private int itemId;
	private int quantity;
	private double restCharge;
	private double delvCharge;
	private double total;
	/**
	 * @return the cartId
	 */
	public int getCartId() {
		return cartId;
	}
	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
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
	 * @return the restCharge
	 */
	public double getRestCharge() {
		return restCharge;
	}
	/**
	 * @param restCharge the restCharge to set
	 */
	public void setRestCharge(double restCharge) {
		this.restCharge = restCharge;
	}
	/**
	 * @return the delvCharge
	 */
	public double getDelvCharge() {
		return delvCharge;
	}
	/**
	 * @param delvCharge the delvCharge to set
	 */
	public void setDelvCharge(double delvCharge) {
		this.delvCharge = delvCharge;
	}
	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(double total) {
		this.total = total;
	}
	public CartDetails(int cartId, int itemId, int quantity, double restCharge, double delvCharge, double total) {
		super();
		this.cartId = cartId;
		this.itemId = itemId;
		this.quantity = quantity;
		this.restCharge = restCharge;
		this.delvCharge = delvCharge;
		this.total = total;
	}
	public CartDetails() {
	
	}
	@Override
	public String toString() {
		return "CartDetails [cartId=" + cartId + ", itemId=" + itemId + ", quantity=" + quantity + ", restCharge="
				+ restCharge + ", delvCharge=" + delvCharge + ", total=" + total + "]";
	}

}
