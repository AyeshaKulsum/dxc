package com.dxc.pms.client;

import java.util.Scanner;

import com.dxc.pms.dao.PassengerDAO;
import com.dxc.pms.dao.PassengerDAOImpl;
import com.dxc.pms.model.Passenger;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PassengerDAO passengerDAO = new PassengerDAOImpl();
		while (true) {
			System.out.println("M E N U ");
			System.out.println("1. Add The passengers : ");
			System.out.println("2. Get All The passengers : ");
			System.out.println("3. E X I T");
			Scanner scanner = new Scanner(System.in);
			int choice = 0;
			System.out.println("Please enter your choice : (1-3)");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter PNR number");
				int pnrNumber = scanner.nextInt();
				System.out.println("Please enter passenger name :");
				String passengerName = scanner.next();
				System.out.println("Please enter source");
				String source = scanner.next();
				System.out.println("Please enter source");
				String destination = scanner.next();
				System.out.println("Enter fare");
				int fare = scanner.nextInt();
				Passenger passenger = new Passenger(pnrNumber, passengerName, source, destination, fare);
				passengerDAO.addPassenger(passenger);
				break;
			case 2:

				System.out.println(passengerDAO.getAllPassengers());
				break;
			case 3:
				System.out.println("Thanks for using my app");
				System.exit(0);
			default:
				System.out.println("Please enter (1-3)");
			}
		}

	}

}
