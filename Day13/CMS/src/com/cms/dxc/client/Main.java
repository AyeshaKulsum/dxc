package com.cms.dxc.client;

import com.cms.dxc.exception.InvalidBillException;
import com.cms.dxc.exception.InvalidCustomerIdException;
import com.cms.dxc.model.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = null;
		try {
			customer = new Customer(100, "Ayesha", "Banglore", 98000);
			customer.setBillAmount(19);
		} catch (InvalidBillException e) {
			System.out.println(e.getMessage());
		} catch (InvalidCustomerIdException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(customer);
		System.out.println("Customer Program Ended");
	}

}
