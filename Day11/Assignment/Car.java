package Assignment;

public class Car extends Vehicle{
	int seat;
	public Car()
	{
		Vehicle vehicle=new Vehicle();
		System.out.println("This is Car Class");
		
		
	}
	
	public Car(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	public Car(String color, int noOfWheels, String model, int seat) {
		super(color, noOfWheels, model);
		this.seat = seat;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
}
