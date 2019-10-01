package Assignment;

public class Bus extends Vehicle {
	int fare;
	
	public Bus()
	{
		Vehicle vehicle=new Vehicle();
		System.out.println("This is Bus Class");
	}

	public Bus(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}
	
}
