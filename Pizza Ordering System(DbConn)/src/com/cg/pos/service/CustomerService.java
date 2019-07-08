/**
 * 
 */
package com.cg.pos.service;

import java.sql.SQLException;

import com.cg.pos.dto.CustomerDetails;
import com.cg.pos.exception.ConnectionException;

/**
 * @author trainee
 *
 */
public interface CustomerService {
public CustomerDetails ViewCustomer(CustomerDetails cusDto) throws ConnectionException, SQLException;
}
