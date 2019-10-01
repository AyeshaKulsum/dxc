package Assignment;

public class Truck extends Vehicle {
	int carryWeight;
	public Truck()
	{
		
		new Vehicle();
		System.out.println("This is Truck Class");
		
		
	}
	
	public Truck(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	public Truck(String color, int noOfWheels, String model, int carryWeight) {
		super(color, noOfWheels, model);
		this.carryWeight = carryWeight;
	}

	public int getCarryWeight() {
		return carryWeight;
	}
	public void setCarryWeight(int carryWeight) {
		this.carryWeight = carryWeight;
	}
	@Override
	public String toString() {
		return "Truck [carryWeight=" + carryWeight + ", getCarryWeight()=" + getCarryWeight() + ", getColor()="
				+ getColor() + ", getNoOfWheels()=" + getNoOfWheels() + ", getModel()=" + getModel() + "]";
	}
	
}
