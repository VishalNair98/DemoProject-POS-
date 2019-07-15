package com.cg.pos.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.pos.dto.CartDetails;
import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.PizzaException;

@Repository
@Transactional
public class CartDaoImpl implements CartDao {

	@PersistenceContext
	private EntityManager manager;

	/**
	 * @param manager the manager to set
	 */
	public CartDetails addToCart(PizzaDetails pizzaDetails) throws PizzaException {
		CartDetails cartDetails = new CartDetails();
		pizzaDetails = manager.find(PizzaDetails.class, pizzaDetails.getItemId());
		if (pizzaDetails != null) {
			cartDetails.setItemId(pizzaDetails.getItemId());
			cartDetails.setRestCharge(pizzaDetails.getPrice());
			cartDetails.setDelvCharge(50);
			cartDetails.setQuantity(pizzaDetails.getQuantity());
			cartDetails
					.setTotal((cartDetails.getRestCharge() + cartDetails.getDelvCharge()) * cartDetails.getQuantity());
			manager.persist(cartDetails);
		}
		return cartDetails;
	}

//	public CartDetails addToCart(CartDetails cartDetails) throws PizzaException {
//		PizzaDetails pizzas = new PizzaDetails();
//		int itemNumber = cartDetails.getItemId();
//		pizzas = manager.find(PizzaDetails.class, itemNumber);
//		cartDetails.setItemId(pizzas.getItemId());
//		cartDetails.setRestCharge(pizzas.getPrice());
//		cartDetails.setDelvCharge(50);
//		cartDetails.setQuantity(pizzas.getQuantity());
//		cartDetails.setTotal((cartDetails.getRestCharge() + cartDetails.getDelvCharge()) * cartDetails.getQuantity());
//		if(pizzas!=null) {
//		manager.persist(cartDetails);
//		}
//		return cartDetails;
//	}

	public CartDetails viewCart(CartDetails cartDetails) throws PizzaException {

		return manager.find(CartDetails.class, cartDetails.getCartId());

	}

	public int removeItem(CartDetails cartDetails) throws PizzaException {
		CartDetails cart = manager.find(CartDetails.class, cartDetails.getCartId());
		if (cart == null) {
			return 1;
		} else
			manager.remove(cart);
		return 0;
	}

	public CartDetails deleteCart(CartDetails cartDetails) throws PizzaException {
		CartDetails emptyCart = new CartDetails();
		Query deleteCart = manager
				.createQuery("delete cartInfo from CartDetails cartInfo where cartInfo.CartDetails.id =: cartId");
		deleteCart.setParameter("cartId", cartDetails.getCartId());
		int execution = deleteCart.executeUpdate();
		if (execution == 1) {
			emptyCart = cartDetails;
		}
		return emptyCart;
	}

}
