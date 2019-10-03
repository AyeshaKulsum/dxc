package dxc;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class DemoCustomer {


	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"AYesha","Banglore",93939);
		Customer customer2 = new Customer(2,"Sam","Kerla",93);
		Customer customer3 = new Customer(3,"Althaf","Mettur",939);
		Customer customer4 = new Customer(4,"Shaheen","Mettur",9);
		Customer customer5 = new Customer(5,"Saif","Chennai",1139);
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(new Customer(1000,"Saihk","TN",828));
		Iterator<Customer> iterator=customers.iterator();
		while(iterator.hasNext()) {
			Customer cust =iterator.next();
			System.out.println(cust);
			
		}
	}

}
