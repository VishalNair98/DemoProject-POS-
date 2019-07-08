package com.cg.pos.dao;

import java.util.ArrayList;

import com.cg.pos.dto.StoreDetails;
import com.cg.pos.exception.ConnectionException;

public interface StoreConnect {
	
	public ArrayList<StoreDetails> viewStore(String pizzaName) throws ConnectionException; 
}
