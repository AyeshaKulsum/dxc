package dxc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingCustomer2 {

	public static void main(String[] args) {
		Customer2 customer1 = new Customer2(1,"AYesha","Banglore",93939);
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
		System.out.println("Before Sorting");
		System.out.println(customers);
		Collections.sort(customers);
		System.out.println("After Sorting");
		System.out.println(customers);
		
	}
}
