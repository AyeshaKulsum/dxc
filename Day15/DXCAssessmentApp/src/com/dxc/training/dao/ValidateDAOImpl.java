package com.dxc.training.dao;

import com.dxc.training.dbcon.DbConnection;
import com.dxc.training.model.User;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidateDAOImpl implements ValidateDAO {
	private static final String FETCH_USER_ALL = "select * from user where userName=? and password=?";
	Connection connection = DbConnection.getConnection();

	public ValidateDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isUserExists(User user) {
		boolean userExists = false;
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(FETCH_USER_ALL);
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			ResultSet res = preparedStatement.executeQuery();
			if (res.next()) {
				userExists = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userExists;
	}

}
