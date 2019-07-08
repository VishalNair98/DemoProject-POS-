package com.cg.pos.dao;

import java.util.ArrayList;

import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.ConnectionException;

public interface PizzaConnect {
      ArrayList<PizzaDetails> viewPizzaDetails() throws ConnectionException;
}
