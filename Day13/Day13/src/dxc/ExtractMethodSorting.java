package dxc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExtractMethodSorting {

	public static void main(String[] args) {
		List<Customer2> customers = customerData();
		printCustomerData("Before Sorting",customers);
		Collections.sort(customers);
		printCustomerData("After Sorting",customers);
		
	}

	private static void printCustomerData(String message,List<Customer2> customers) {
		System.out.println(message);
		System.out.println(customers);
	}

	private static List<Customer2> customerData() {
		Customer2 customer1 = new Customer2(1,"Ayesha","Banglore",93939);
		Customer2 customer2 = new Customer2(2,"Sam","Kerla",93);
		Customer2 customer3 = new Customer2(3,"Althaf","Mettur",939);
		Customer2 customer4 = new Customer2(4,"Shaheen","Mettur",9);
		Customer2 customer5 = new Customer2(5,"Saif","Chennai",1139);
		List<Customer2> customers = new ArrayList<Customer2>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(new Customer2(1000,"Saihk","TN",828));
		return customers;
	}
}
