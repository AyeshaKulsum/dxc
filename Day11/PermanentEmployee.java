
public class PermanentEmployee extends EmployeeInherit {
private int salary;
private int bonus;
public PermanentEmployee() {
	super();
}
public PermanentEmployee(int salary, int bonus) {
	super();
	this.salary = salary;
	this.bonus = bonus;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
@Override
public String toString() {
	return "RegularEmployee [salary=" + salary + ", bonus=" + bonus + ", getSalary()=" + getSalary() + ", getBonus()="
			+ getBonus() + "]";
}

}
