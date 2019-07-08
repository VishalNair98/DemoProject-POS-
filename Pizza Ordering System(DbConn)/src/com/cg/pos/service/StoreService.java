/**
 * 
 */
package com.cg.pos.service;

import java.util.ArrayList;

import com.cg.pos.dto.StoreDetails;
import com.cg.pos.exception.ConnectionException;

/**
 * @author trainee
 *
 */
public interface StoreService {
     
//     public ArrayList<StoreDetails> viewStore(String pizzaName);

	public ArrayList<StoreDetails> viewStore(String pizzaName) throws ConnectionException;
     
     
}
