/**
 * 
 */
package com.cg.pos.dto;

/**
 * @author trainee
 *
 */
public class CustomerDetails {
	String customerId;
	String customerName;
	String contactNo;
	String gender;
	String email;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String cId) {
		this.customerId = cId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String cName) {
		this.customerName = cName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contact) {
		this.contactNo = contact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return customerId + " " + customerName + " " + contactNo + " " + gender + " " + email;

	}

//	public void setCustomerName(String custName) {
//
//		this.customerName = custName;
//	}

}
