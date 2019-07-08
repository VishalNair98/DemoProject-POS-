/**
 * 
 */
package com.cg.pos.dto;

/**
 * @author trainee
 *
 */
public class OrderDetails {
    private Integer orderId;
    private String cartId;
	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the cartId
	 */
	public String getcartId() {
		return cartId;
	}
	/**
	 * @param cartId the cartId to set
	 */
	public void setCartId(String cartId) {
		cartId = cartId;
	}
	public String toString() {
		return cartId+" "+orderId; 
	}
}
