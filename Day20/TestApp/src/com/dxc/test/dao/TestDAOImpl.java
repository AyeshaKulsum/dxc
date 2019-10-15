package com.dxc.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dxc.test.dbcon.DBConnection;

public class TestDAOImpl implements TestDAO {
	Connection connection = DBConnection.getConnection();
	private static final String FETCH_QUESTION ="select * from test where question=? and answer=?";
	
	public TestDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculate(int count) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean validateUser(String question, String answer) {
		boolean questionExists=false;
		PreparedStatement preparedStatement;
		try
		{
		preparedStatement = connection.prepareStatement(FETCH_QUESTION);
		preparedStatement.setString(1, question);
		preparedStatement.setString(2, answer);
		ResultSet res = preparedStatement.executeQuery();
		if(res.next())
		{
			
			questionExists=true;
		}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return questionExists;
	}

}
