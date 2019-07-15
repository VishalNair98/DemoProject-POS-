package com.cg.pos.dao;

import java.util.List;

import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.dto.StoreDetails;

public interface PizzaDao {
	public PizzaDetails searchPizza(PizzaDetails details);

	public List<StoreDetails> searchStore(PizzaDetails pizzaDetails);
}
