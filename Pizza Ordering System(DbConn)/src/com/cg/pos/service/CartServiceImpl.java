package com.cg.pos.service;

import com.cg.pos.dao.CartConnect;
import com.cg.pos.dao.CartConnectImpl;
import com.cg.pos.dto.OrderDetails;
import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.util.CartValidation;
import com.cg.pos.util.ExceptionMessages;

public class CartServiceImpl implements CartService {
	CartConnect cartConnect = new CartConnectImpl();

	@Override
	public PizzaDetails addToCart(PizzaDetails pizzaId, PizzaDetails pizzaQuantity) throws ConnectionException {
		CartValidation cartValidateId = new CartValidation();
		CartValidation cartValidateQuantity = new CartValidation();

		cartValidateId.itemIdValidation(pizzaId.getItemId());
		cartValidateQuantity.itemQuantityValidation(pizzaQuantity.getQuantity());

		PizzaDetails pizDetails = new PizzaDetails();
		CartConnect cartConnect = new CartConnectImpl();
		pizDetails = cartConnect.addToCart(pizzaId);
		if(pizDetails.getQuantity() > 10) {
			System.out.println(ExceptionMessages.Message4);
		}
		return pizDetails;
		
	}

	@Override
	public void confirmOrder(int cartId) throws ConnectionException {
//		System.out.println("The order has been placed");
		OrderDetails orders = new OrderDetails();
		CartConnect cartConnect = new CartConnectImpl();
		orders = cartConnect.confirmOrder(cartId);
		if(orders.getOrderId() == null)
		{
			System.out.println(ExceptionMessages.Message5);
		}
		
	}

	@Override
	public PizzaDetails addMore(PizzaDetails pizzaId, PizzaDetails pizzaQuantity) throws ConnectionException {
		cartConnect.addMore(pizzaId, pizzaQuantity);
		return null;
	}

	@Override
	public void viewCart(String cartId) throws ConnectionException {
		cartConnect.viewCart(cartId);
	}

	@Override
	public void deleteCart(String id) throws ConnectionException {
		cartConnect.deleteCart(id);
        
	}

}
