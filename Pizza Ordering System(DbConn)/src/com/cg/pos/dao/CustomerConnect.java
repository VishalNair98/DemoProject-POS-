package com.cg.pos.dao;

import java.sql.SQLException;

import com.cg.pos.dto.CustomerDetails;
import com.cg.pos.exception.ConnectionException;

public interface CustomerConnect {

	CustomerDetails viewCustomerDetails(CustomerDetails cusDto) throws  ConnectionException, SQLException;
      
}
