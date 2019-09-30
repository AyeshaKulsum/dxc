
public class Customer {
	
	int customerId;
	String customerName;
	String customerAddress;
	int billAmount;
public Customer()
{
	customerId=0;
	customerName="Not Available";
	customerAddress="Not Available";
	billAmount=100;
	
}
public Customer(int customerId, String customerName, String customerAddress, int billAmount)
{
	this.customerId=customerId;
	this.customerName=customerName;
	this.customerAddress=customerAddress;
	this.billAmount=billAmount;
}

public void display()
{
	System.out.println("Customer ID:"+customerId);
	System.out.println("customer name :"+customerName);
	System.out.println("Customer Address :"+customerAddress);
	System.out.println("Bill Amount :"+billAmount);
}
public static void main(String args[]) {
	Customer customer1= new Customer(1,"Kavya","Ongole",900);
	customer1.display();
	System.out.println("###########################");
Customer customer2= new Customer(2,"Ayesha","Mettur",1000);
customer2.display();
	System.out.println("###########################");
Customer customer3= new Customer();
customer3.display();
	System.out.println("###########################");
Customer customer4= new Customer(4,"Sharmila","Ap",2000);
customer4.display();
	System.out.println("###########################");
Customer customer5= new Customer();
customer5.display();
	System.out.println("###########################");
	
}
}
