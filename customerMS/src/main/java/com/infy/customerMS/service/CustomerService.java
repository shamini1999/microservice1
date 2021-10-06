package com.infy.customerMS.service;

import com.infy.customerMS.model.Address;
import com.infy.customerMS.model.Customer;

public interface CustomerService {

	public Customer authenticateCustomer(String emailId, String password) throws Exception;
	public String registerNewCustomer(Customer customer) throws Exception ;

	public void updateProfile(Customer customer) throws Exception;

	public void changePassword(String sellerEmailId, String currentPassword, String newPassword) throws Exception;
	public Integer addShippingAddress(String customerEmailId, Address  address) throws Exception;
	
	public void updateShippingAddress(Address address) throws Exception;
	
	public void deleteShippingAddress(String customerEmailId, Integer addressId) throws Exception;
	
	public Address getShippingAddress(Integer addressId) throws Exception;
}
