package com.cg.pos.dao;

import com.cg.pos.dto.CartDetails;
import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.PizzaException;

public interface CartDao {

	CartDetails addToCart(PizzaDetails pizzaDetails) throws PizzaException; 
	
	CartDetails viewCart(CartDetails cartDetails) throws PizzaException;

	int removeItem(CartDetails cartDetails) throws PizzaException;

	CartDetails deleteCart(CartDetails cartDetails) throws PizzaException;

}