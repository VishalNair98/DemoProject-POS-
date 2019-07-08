package com.cg.pos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.pos.dto.CustomerDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.util.Connect;
import com.cg.pos.util.DbQuery;

public class CustomerConnectImpl implements CustomerConnect {

	@SuppressWarnings("unused")
	Connection connection = null;

	@Override
	public CustomerDetails viewCustomerDetails(CustomerDetails cusDto) throws ConnectionException {
//		Connection connection = null;
		CustomerDetails customerDTO = new CustomerDetails();
		try {
			connection = Connect.getConnection();
			String sql = DbQuery.ViewCustomer;
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, cusDto.getCustomerId());
			ResultSet result = statement.executeQuery();

			while (result.next()) {
				customerDTO.setCustomerId(result.getInt(1) + "");
				customerDTO.setCustomerName(result.getString(2));
				customerDTO.setContactNo(result.getLong(3) + "");
				customerDTO.setGender(result.getString(4));
				customerDTO.setEmail(result.getString(5));
			}

			statement.close();

		} catch (SQLException e) {

			throw new ConnectionException(e);
		}
//		System.out.println(customerDTO);
		return customerDTO;
	}
}
