package com.cg.pos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.dto.StoreDetails;
import com.cg.pos.exception.PizzaException;
import com.cg.pos.service.PizzaService;

@RestController
@RequestMapping(value = "/pizza")
public class PizzaController {
	@Autowired
	private PizzaService pizzaService;

	public void setPizzaService(PizzaService pizzaService) {
		this.pizzaService = pizzaService;
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST, produces = "application/JSON", consumes = "application/JSON")

	public PizzaDetails viewPizza(@RequestBody PizzaDetails pizzaDetails) throws PizzaException {

		return pizzaService.searchPizza(pizzaDetails);

	}

	@RequestMapping(value = "/search/store", method = RequestMethod.POST, produces = "application/JSON", consumes = "application/JSON")

	public List<StoreDetails> viewStore(@RequestBody PizzaDetails pizzaDetails) throws PizzaException {

		return pizzaService.searchStore(pizzaDetails);

	}
}
