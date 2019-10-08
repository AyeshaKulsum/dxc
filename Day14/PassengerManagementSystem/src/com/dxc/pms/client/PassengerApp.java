package com.dxc.pms.client;

import java.util.Scanner;

import com.dxc.pms.dao.PassengerDAO;
import com.dxc.pms.dao.PassengerDAOImpl;
import com.dxc.pms.model.Passenger;

public class PassengerApp {
	PassengerDAO passengerDAO;
	int choice = 0;
	int pnrNumber;
	String passengerName ;
	String source;
	String destination;
	int fare;
	Scanner scanner = new Scanner(System.in);
	public PassengerApp() {
		this.passengerDAO = new PassengerDAOImpl();
	}

public void launchAPP()
{
	while (true) {
		System.out.println("M E N U ");
		System.out.println("1. Add The passengers : ");
		System.out.println("2. Get All The passengers : ");
		System.out.println("3. Get Passenger By PnrNumber");
		System.out.println("4. Delete Passenger By PnrNumber");
		System.out.println("5. Update Passenger By PnrNumber");
		System.out.println("6. E X I T");
		
		
		System.out.println("Please enter your choice : (1-6)");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			Passenger passenger = takePasengerInput();
			passengerDAO.addPassenger(passenger);
			break;
		case 2:

			System.out.println(passengerDAO.getAllPassengers());
			break;
		case 3:
			System.out.println("Please enter pnr to search");
			pnrNumber=scanner.nextInt();
			Passenger searchedProduct = passengerDAO.getPassenger(pnrNumber);
			System.out.println(searchedProduct);
			break;
		case 4:
			System.out.println("Please enter pnr number to delete");
			pnrNumber=scanner.nextInt();
			passengerDAO.deletePassenger(pnrNumber);
			System.out.println("Product deleted successfully");
			break;
		case 5:
			System.out.println("Welcome to product app update");
			Passenger productToUpdate = takePasengerInput();
			passengerDAO.updatePassenger(productToUpdate);
			System.out.println("Your product updated successfully");
			break;
		case 6:
			System.out.println("Thanks for using my app");
			System.exit(0);
			break;
		default:
			System.out.println("Please enter (1-6)");
		}
	}
}

private Passenger takePasengerInput() {
	System.out.println("Enter PNR number");
	pnrNumber = scanner.nextInt();
	System.out.println("Please enter passenger name :");
	passengerName = scanner.next();
	System.out.println("Please enter source");
	source = scanner.next();
	System.out.println("Please enter destination");
	String destination = scanner.next();
	System.out.println("Enter fare");
	fare = scanner.nextInt();
	Passenger passenger = new Passenger(pnrNumber, passengerName, source, destination, fare);
	return passenger;
}

}
