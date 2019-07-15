package com.cg.pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pos.dao.CartDao;
import com.cg.pos.dto.CartDetails;
import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.PizzaException;

@Service
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDao cartConnect;

	public void setCartConnect(CartDao cartConnect) {
		this.cartConnect = cartConnect;
	}

	public CartDetails viewCart(CartDetails cartDetails) throws PizzaException {
		return cartConnect.viewCart(cartDetails);

	}

	public int removeItem(CartDetails cartDetails) throws PizzaException {
		return cartConnect.removeItem(cartDetails);

	}

	public CartDetails deleteCart(CartDetails cartDetails) throws PizzaException {
		return cartConnect.deleteCart(cartDetails);

	}

	public CartDetails addToCart(PizzaDetails pizzaDetails) throws PizzaException {
		
		return  cartConnect.addToCart(pizzaDetails);
	}

}
