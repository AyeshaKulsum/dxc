
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//insert dynamic values
public class Demo4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc", "root", "root");
		System.out.println("Connected");
		Statement stat = con.createStatement();
		int rowsAffected = stat.executeUpdate("update employee set salary = 90000 where empName='Saif'");
		
		System.out.println(rowsAffected+"Inserted Successfully");
		
		}

	}