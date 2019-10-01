
public class ContractEmployee extends EmployeeInherit {
private int payPerHour;
private int contractDuration;
public ContractEmployee() {
	super();
}
public ContractEmployee(int payPerHour, int contractDuration) {
	super();
	this.payPerHour = payPerHour;
	this.contractDuration = contractDuration;
}
public int getPayPerHour() {
	return payPerHour;
}
public void setPayPerHour(int payPerHour) {
	this.payPerHour = payPerHour;
}
public int getContractDuration() {
	return contractDuration;
}
public void setContractDuration(int contractDuration) {
	this.contractDuration = contractDuration;
}
@Override
public String toString() {
	return "ContractEmployee [payPerHour=" + payPerHour + ", contractDuration=" + contractDuration
			+ ", getPayPerHour()=" + getPayPerHour() + ", getContractDuration()=" + getContractDuration() + "]";
}

}
