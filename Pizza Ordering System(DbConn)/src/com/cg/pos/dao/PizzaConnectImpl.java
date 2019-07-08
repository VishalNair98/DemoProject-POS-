package com.cg.pos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.util.Connect;
import com.cg.pos.util.DbQuery;
import com.cg.pos.util.ExceptionMessages;

public class PizzaConnectImpl implements PizzaConnect {
	Connection connection = null;

	@Override
	public ArrayList<PizzaDetails> viewPizzaDetails() throws ConnectionException {
		ArrayList<PizzaDetails> pizzaList = new ArrayList<PizzaDetails>();
		try {

			connection = Connect.getConnection();

			PreparedStatement prepStatement = connection.prepareStatement(DbQuery.ViewPizza);

			ResultSet pizSet = prepStatement.executeQuery();

			while (pizSet.next()) {
				PizzaDetails pizzaDetails = new PizzaDetails();
				pizzaDetails.setStoreId(pizSet.getInt(1) + "");
				pizzaDetails.setItemId(pizSet.getInt(2) + "");
				pizzaDetails.setQuantity(pizSet.getInt(3));
				pizzaDetails.setPrice(pizSet.getInt(4));
				pizzaDetails.setItemName(pizSet.getString(5));
				pizzaList.add(pizzaDetails);

			}
			pizSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ConnectionException(ExceptionMessages.Message1);
		}

		// System.out.println(pizzaList);
//       for (PizzaDetails pizzaDetails : pizzaList) {
//    	  return pizzaDetails;
//	}
		return pizzaList;
	}

}
