package com.cg.pos.service;

import java.util.List;

import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.dto.StoreDetails;

public interface PizzaService {
	public PizzaDetails searchPizza(PizzaDetails details);

	public List<StoreDetails> searchStore(PizzaDetails pizzaDetails);
}
