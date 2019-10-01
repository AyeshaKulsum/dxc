
public class Main {
public static void main(String[] args) {
	PermanentEmployee permanentEmployee = new PermanentEmployee();
	permanentEmployee.setSalary(50000);
	permanentEmployee.setBonus(100000);
	System.out.println(permanentEmployee);
	ContractEmployee contractEmployee =new ContractEmployee();
	contractEmployee.setPayPerHour(2434);
	contractEmployee.setContractDuration(1);
	System.out.println(contractEmployee);
}


}
