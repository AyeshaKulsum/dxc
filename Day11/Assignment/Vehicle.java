package Assignment;

public class Vehicle {
	
	private String color;
	private int noOfWheels;
	private String model;
	
	public Vehicle(String color, int noOfWheels, String model) {
		super();
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Vehicle()
	{
		System.out.println("This is Vehicle Class");
	}
	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", noOfWheels=" + noOfWheels + ", model=" + model + ", getColor()="
				+ getColor() + ", getNoOfWheels()=" + getNoOfWheels() + ", getModel()=" + getModel() + "]";
	}
	
}
