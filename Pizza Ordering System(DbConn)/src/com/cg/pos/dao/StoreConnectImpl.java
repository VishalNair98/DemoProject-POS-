package com.cg.pos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.pos.dto.StoreDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.util.Connect;
import com.cg.pos.util.DbQuery;

public class StoreConnectImpl implements StoreConnect {
	
	Connection connection = null;

	public ArrayList<StoreDetails> viewStore(String pizzaName) throws ConnectionException {

		ArrayList<StoreDetails> storeList = new ArrayList<StoreDetails>();
		StoreDetails storeDetails = new StoreDetails();
		try {
			connection = Connect.getConnection();
			String showStore = DbQuery.showStore;
			PreparedStatement store = connection.prepareStatement(showStore);
			store.setString(1, pizzaName);
			ResultSet storeSet = store.executeQuery();
			while (storeSet.next()) {
				storeDetails.setStoreId(storeSet.getInt(1));
				storeDetails.setStoreName(storeSet.getString(2));
				storeDetails.setStoreAddress(storeSet.getString(3));
				
				storeList.add(storeDetails);
			}
			store.close();
		} catch (SQLException e) {
			throw new ConnectionException(e);
		}
		return storeList;
	}
}
