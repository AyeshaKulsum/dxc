package com.dxc.test.dbcon;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

	public DBConnection() {

	}
	public static Connection getConnection() {
		Properties properties = new Properties();
		String username = null;
		String password = null;
		String driver = null;
		String url=null;
		
		try {
			FileReader reader = new FileReader("C:\\Users\\asj2\\Desktop\\Training\\Day17\\DXCAPP1\\mydb.properties.txt");
			properties.load(reader);
			username = properties.getProperty("username");		
			password = properties.getProperty("password");
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection connection=null;
		try {
			connection = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
