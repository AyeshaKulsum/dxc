package com.dxc.pms.dao;

import java.util.ArrayList;
import java.util.List;

import com.dxc.pms.model.Passenger;

public class PassengerDAOImpl implements PassengerDAO {

	public PassengerDAOImpl() {
		
	}
	List<Passenger> allPassenger=new ArrayList<Passenger>();
	@Override
	public Passenger getPassenger(int pnrNumber) {
		
		return null;
	}

	@Override
	public List<Passenger> getAllPassengers() {
		
		return allPassenger;
	}

	@Override
	public void addPassenger(Passenger passenger) {
		
		allPassenger.add(passenger);
	}

	@Override
	public void deletePassenger(int pnrNumber) {
		

	}

	@Override
	public void updatePassenger(Passenger passenger) {
		

	}

}
