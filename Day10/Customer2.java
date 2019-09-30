
public class Customer2 {
	
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
public Customer2()
{
	customerId=0;
	customerName="Not Available";
	customerAddress="Not Available";
	billAmount=100;
	
}
public Customer2(int customerId, String customerName, String customerAddress, int billAmount)
{
	this.customerId=customerId;
	this.customerName=customerName;
	this.customerAddress=customerAddress;
	this.billAmount=billAmount;
}

public Customer2(int customerId, String customerName) {
	this();
	this.customerId = customerId;
	this.customerName = customerName;
}
public void display()
{
	System.out.println("Customer ID:"+customerId);
	System.out.println("customer name :"+customerName);
	System.out.println("Customer Address :"+customerAddress);
	System.out.println("Bill Amount :"+billAmount);
}
//Getters and Setters
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerAddress() {
	return customerAddress;
}
public void setCustomerAddress(String customerAddress) {
	this.customerAddress = customerAddress;
}
public int getBillAmount() {
	return billAmount;
}
public void setBillAmount(int billAmount) {
	this.billAmount = billAmount;
}
public int getCustomerId() {
	return customerId;
}

}
