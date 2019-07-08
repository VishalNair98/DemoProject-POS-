package com.cg.pos.ui;

import java.util.ArrayList;

import com.cg.pos.dao.StoreConnect;
import com.cg.pos.dao.StoreConnectImpl;
import com.cg.pos.dto.StoreDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.service.StoreService;

public class StoreServiceImpl implements StoreService {

	@Override
	public ArrayList<StoreDetails> viewStore(String pizzaName) throws ConnectionException {
		StoreDetails storeDetails = new StoreDetails();
		StoreConnect storeConnect = new StoreConnectImpl();
		ArrayList<StoreDetails> storeData= storeConnect.viewStore(pizzaName);
		return storeData;

	}

}
