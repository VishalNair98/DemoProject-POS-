package com.cg.pos.dao;

import com.cg.pos.dto.OrderDetails;
import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.ConnectionException;

public interface CartConnect {
	public PizzaDetails addToCart(PizzaDetails pizzaId) throws ConnectionException;

	public OrderDetails confirmOrder(int cartId) throws ConnectionException;

	public PizzaDetails addMore(PizzaDetails pizzaId, PizzaDetails pizzaQuantity) throws ConnectionException;

	public void viewCart(String cartId) throws ConnectionException;

	public void deleteCart(String id) throws ConnectionException;
}
