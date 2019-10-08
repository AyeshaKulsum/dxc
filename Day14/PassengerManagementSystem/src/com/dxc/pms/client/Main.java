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
PassengerApp passengerApp= new PassengerApp();
passengerApp.launchAPP();

	}

}
