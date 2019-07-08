/**
 * 
 */
package com.cg.pos.service;

import java.sql.SQLException;

import com.cg.pos.dao.CustomerConnect;
import com.cg.pos.dao.CustomerConnectImpl;
import com.cg.pos.dto.CustomerDetails;
import com.cg.pos.exception.ConnectionException;
import com.cg.pos.util.CustomerValidation;
import com.cg.pos.util.ExceptionMessages;

/**
 * @author trainee
 *
 */
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDetails ViewCustomer(CustomerDetails cusDto) throws ConnectionException {
		CustomerValidation customerVal = new CustomerValidation();
		customerVal.custIdValidation(cusDto.getCustomerId());
		CustomerConnect customerDao = new CustomerConnectImpl();
		CustomerDetails customerDTO = new CustomerDetails();

		try {
			customerDTO = customerDao.viewCustomerDetails(cusDto);
		} catch (ConnectionException e) {

			System.out.println(ExceptionMessages.Message2);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if (customerDTO.getCustomerName() == null) {
			throw new ConnectionException(ExceptionMessages.Message2);
		}
		System.out.println(customerDTO.getCustomerName());
		return customerDTO;

	}

}
