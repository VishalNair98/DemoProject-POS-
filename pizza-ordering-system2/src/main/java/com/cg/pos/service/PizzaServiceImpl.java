package com.cg.pos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pos.dao.PizzaDao;
import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.dto.StoreDetails;

@Service
public class PizzaServiceImpl implements PizzaService {
	@Autowired
	private PizzaDao pizzaDao;

	public void setPizzaDao(PizzaDao pizzaDao) {
		this.pizzaDao = pizzaDao;
	}

	public PizzaDetails searchPizza(PizzaDetails details) {

		return pizzaDao.searchPizza(details);
	}

	public List<StoreDetails> searchStore(PizzaDetails pizzaDetails) {
		
		return pizzaDao.searchStore(pizzaDetails);
	}

}
