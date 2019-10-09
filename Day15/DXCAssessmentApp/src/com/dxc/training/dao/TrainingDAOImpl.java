package com.dxc.training.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dxc.training.dbcon.DbConnection;
import com.dxc.training.model.Training;

public class TrainingDAOImpl implements TrainingDAO {
	Scanner scanner = new Scanner(System.in);
	Connection connection = DbConnection.getConnection();
	private static final String FETCH_TRAINING_ALL = "select * from training";

	@Override
	public List<Training> getAllDetails() {
		List<Training> allTraining = new ArrayList<Training>();

		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_TRAINING_ALL);
			while (res.next()) {
				Training training = new Training();
				training.setSapId(res.getInt(1));
				training.setEmployeeName(res.getString(2));
				training.setStream(res.getString(3));
				training.setPercentage(res.getInt(4));
				allTraining.add(training);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allTraining;
	}

	public void getOneByOne() {
		Training training = new Training();
		Statement stat;
		try {
			stat = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet = stat.executeQuery("select * from training");
			ResultSetMetaData rsmd = resultSet.getMetaData();
			int columnsNumber = rsmd.getColumnCount();

			while (resultSet.next()) {
				for (int i = 1; i <= rsmd.getColumnCount(); i++) {
					System.out.print(resultSet.getString(i) + " ");
					System.out.println();

					System.out.print(resultSet.getString(i) + " ");
					System.out.println();
					if (i == 4) {
						System.out.println("Enter Percentage");
						int percentage = scanner.nextInt();
						resultSet.updateInt(4, percentage);
						resultSet.updateRow();
					}
				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
