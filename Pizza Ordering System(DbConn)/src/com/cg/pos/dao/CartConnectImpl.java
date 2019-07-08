package com.cg.pos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.pos.dto.CartDetails;
import com.cg.pos.dto.OrderDetails;
import com.cg.pos.dto.PizzaDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.util.Connect;
import com.cg.pos.util.DbQuery;

public class CartConnectImpl implements CartConnect {
	Connection connection = null;

	PizzaDetails pizzaDetails = new PizzaDetails();
	CartDetails cartDetails = new CartDetails();

	@Override
	public PizzaDetails addToCart(PizzaDetails pizzaId) throws ConnectionException {

		try {
			connection = Connect.getConnection();
			System.out.println("dcfgvhd");
			PreparedStatement prepStatement = connection.prepareStatement(DbQuery.AddItem);
			System.out.println("dfgsd");
			prepStatement.setString(1, pizzaId.getItemId());
			System.out.println("vdcvzs");
//			prepStatement.setInt(2, pizzaQuantity.getQuantity());
//			System.out.println("vdgergvzs");
			ResultSet pizzSet = prepStatement.executeQuery();
			System.out.println("dgxgh");

			while (pizzSet.next()) {
				pizzaDetails.setStoreId(pizzSet.getInt(1) +"");
				pizzaDetails.setItemId(pizzSet.getInt(2) + "");
				pizzaDetails.setQuantity(pizzSet.getInt(3));
				pizzaDetails.setPrice((double) pizzSet.getInt(4));
				pizzaDetails.setItemName(pizzSet.getString(5));
				pizzaDetails.setAddOns(pizzSet.getString(6));
				
			}

		} catch (SQLException e) {
			throw new ConnectionException(e);
		}

//		 addMore(pizzaId, pizzaQuantity);
		return pizzaDetails;
	}

	@Override
	public OrderDetails confirmOrder(int cartId) throws ConnectionException {
		OrderDetails orderDetails = new OrderDetails();
		try {
			connection = Connect.getConnection();
			PreparedStatement order = connection.prepareStatement(DbQuery.LookCart);
			order.setString(1, orderDetails.getcartId());
			ResultSet orderResult =  order.executeQuery();
			while(orderResult.next()) {
				orderDetails.setCartId(orderResult.getInt(1)+"");
				orderDetails.setOrderId(orderResult.getInt(2));
			}
			
		}
		catch(SQLException e) {
			throw new ConnectionException(e);
		}
		return orderDetails;
	}

	@Override
	public void viewCart(String cartId) throws ConnectionException {

		try {

			connection = Connect.getConnection();
			PreparedStatement prepStatement = connection.prepareStatement(DbQuery.ViewPizza);
			ResultSet pizSet = prepStatement.executeQuery();
		} catch (SQLException e) {

		}

	}

	@Override
	public void deleteCart(String id) throws ConnectionException {

		try {

			connection = Connect.getConnection();

			PreparedStatement prepStatement = connection.prepareStatement(DbQuery.ViewPizza);

			ResultSet pizSet = prepStatement.executeQuery();
		} catch (SQLException e) {

		}

	}

	@Override
	public PizzaDetails addMore(PizzaDetails pizzaId, PizzaDetails pizzaQuantity) throws ConnectionException {
		try {
			connection = Connect.getConnection();
			PreparedStatement prepStatement = connection.prepareStatement(DbQuery.AddItem);
			prepStatement.setString(1, pizzaId.getItemId());
			prepStatement.setInt(2, pizzaQuantity.getQuantity());
			ResultSet pizzSet = prepStatement.executeQuery();

			while (pizzSet.next()) {
				pizzaDetails.setStoreId(pizzSet.getInt(1) + "");
				pizzaDetails.setItemId(pizzSet.getInt(2) + "");
				pizzaDetails.setQuantity(pizzSet.getInt(3));
				pizzaDetails.setPrice((double) pizzSet.getInt(4));
				pizzaDetails.setItemName(pizzSet.getString(5));
			}

		} catch (SQLException e) {

		}
		return pizzaDetails;
	}

//	@Override
//	public PizzaDetails addToCart(PizzaDetails pizzaId, PizzaDetails pizzaQuantity) throws ConnectionException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
