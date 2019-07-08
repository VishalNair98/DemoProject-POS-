package com.cg.pos.util;

import com.cg.pos.exception.ConnectionException;

public class CartValidation {
	public void itemIdValidation(String itemId) throws ConnectionException {
		if (itemId.isEmpty()) {
			System.out.println(ExceptionMessages.Message4);
		}
	}

	public void itemQuantityValidation(int quantity) throws ConnectionException {
		if (quantity > 10) {
			System.out.println(ExceptionMessages.Message4);
		}
	}
}
