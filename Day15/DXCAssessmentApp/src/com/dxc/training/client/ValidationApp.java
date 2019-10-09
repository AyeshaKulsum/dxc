package com.dxc.training.client;

import java.util.Scanner;

import com.dxc.training.dao.TrainingDAO;
import com.dxc.training.dao.TrainingDAOImpl;
import com.dxc.training.dao.ValidateDAO;
import com.dxc.training.dao.ValidateDAOImpl;
import com.dxc.training.model.User;

public class ValidationApp {
	ValidateDAO validateDAO = new ValidateDAOImpl();
	TrainingDAO trainingDAO = new TrainingDAOImpl();
	Scanner scanner = new Scanner(System.in);
	String userName;
	String password;
	int choice = 0;

	public void launchApp() {
		User user = takeInput();
		if (validateDAO.isUserExists(user)) {
			System.out.println("User successfully authenticated.");
			while (true) {

				System.out.println("M E N U");
				System.out.println("1)	Display All Training Records");
				System.out.println("2)	Display Records one by One and update the percentage");
				System.out.println("3)	E X I T");
				System.out.println("Please enter your choice : (1-6)");
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					System.out.println(trainingDAO.getAllDetails());
					break;
				case 2:
					System.out.println("Displaying");
					trainingDAO.getOneByOne();
					break;
				case 3:
					System.out.println("Thanks for using my app");
					System.exit(0);
					break;
				default:
					System.out.println("Please enter (1-3)");
				}
			}
		} else {
			System.out.println(":  User name cannot be authenticated");
		}

	}

	private User takeInput() {
		System.out.println("Enter your Credentials");
		System.out.println("Enter Username :");
		userName = scanner.next();
		System.out.println("Enter Password :");
		password = scanner.next();
		User user = new User(userName, password);
		return user;
	}
}
