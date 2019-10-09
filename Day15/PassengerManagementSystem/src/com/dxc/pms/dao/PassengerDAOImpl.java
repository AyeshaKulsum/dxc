package com.dxc.pms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dxc.pms.dbcon.DbConnection;
import com.dxc.pms.model.Passenger;

public class PassengerDAOImpl implements PassengerDAO {
	Connection connection = DbConnection.getConnection();
	private static final String FETCH_PRODUCT_ALL ="select * from passenger";
	public PassengerDAOImpl() {
		
	}
	
	@Override
	public Passenger getPassenger(int pnrNumber) {
Passenger passenger = new Passenger();
		
		if(passenger.getPnrNumber()==pnrNumber)
		{
			return passenger;
		}
		return passenger;
	}

	@Override
	public List<Passenger> getAllPassengers() {
		List<Passenger> allPassenger=new ArrayList<Passenger>();
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_PRODUCT_ALL);
			while(res.next())
			{
				Passenger passenger = new Passenger();
				passenger.setPnrNumber(res.getInt(1));
				passenger.setPassengerName(res.getString(2));
				passenger.setSource(res.getString(3));
				passenger.setDestination(res.getString(4));
				passenger.setFare(res.getInt(5));
				allPassenger.add(passenger);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allPassenger;
	}

	@Override
	public void addPassenger(Passenger passenger) {
		
		PreparedStatement stat;
		try {
			stat = connection.prepareStatement("insert into passenger value(?,?,?,?,?)");
			stat.setInt(1,passenger.getPnrNumber());
			stat.setString(2,passenger.getPassengerName());
			stat.setString(3,passenger.getSource());
			stat.setString(4,passenger.getDestination());
			stat.setInt(5,passenger.getFare());
			stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deletePassenger(int pnrNumber) {
		PreparedStatement stat;
		try {
			stat = connection.prepareStatement("delete product where pnrNumber=?");
			stat.setInt(1,pnrNumber );
			stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updatePassenger(Passenger passenger) {
		

	}

}
