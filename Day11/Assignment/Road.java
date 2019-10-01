package Assignment;

public class Road {
public static void main(String[] args) {
	new Truck();
	new Car();
	new Bus();
	 Truck truck=new Truck("Blue",6,"Tata Motors");
	 truck.setCarryWeight(4000);
		System.out.println(truck);
	 Car car=new Car("Grey",4,"Audi");
	 car.setSeat(6);
	 System.out.println(car);
	 Bus bus=new Bus("Green",20,"SETC");
	 bus.setFare(80);
	 System.out.println(bus);
}
}
