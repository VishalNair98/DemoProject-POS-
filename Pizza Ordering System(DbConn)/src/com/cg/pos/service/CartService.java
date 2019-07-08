/**
 * 
 */
package com.cg.pos.service;

import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.ConnectionException;

/**
 * @author trainee
 *
 */
public interface CartService {
	public PizzaDetails addToCart(PizzaDetails pizzaId, PizzaDetails pizzaQuantity) throws ConnectionException;

	public void confirmOrder(int cartId) throws ConnectionException;

	public PizzaDetails addMore(PizzaDetails pizzaId, PizzaDetails pizzaQuantity) throws ConnectionException;

	public void viewCart(String cartId) throws ConnectionException;

	public void deleteCart(String id) throws ConnectionException;
}
