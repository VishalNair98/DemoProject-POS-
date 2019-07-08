package com.cg.pos.ui;

import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.service.CartService;
import com.cg.pos.service.CartServiceImpl;
import com.cg.pos.util.ExceptionMessages;

public class AddPizza {
        public static PizzaDetails includePizza(PizzaDetails pizzaId, PizzaDetails pizzaQuantity)  {
			PizzaDetails pizzaDetails = new PizzaDetails();
			 CartService cartService = new CartServiceImpl();
		       
		        try {
					pizzaDetails = cartService.addToCart(pizzaId, pizzaQuantity);
				} catch (ConnectionException e) {
					System.out.println(ExceptionMessages.Message1);
				}
		        System.out.println(pizzaDetails);
			
        	return pizzaDetails;
        	
        }
}
