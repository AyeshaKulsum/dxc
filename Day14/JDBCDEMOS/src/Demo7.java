
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//insert dynamic values
public class Demo7 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id");
		int empId= sc.nextInt();
		System.out.println("Enter emp name");
		String empName= sc.next();
		System.out.println("Enter emp address");
		String empAddress= sc.next();
		System.out.println("Enter salary");
		int salary= sc.nextInt();
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc", "root", "root");
		
		System.out.println("Connected");
		
		PreparedStatement stat = con.prepareStatement("update employee set empName=?,empAddress=?,salary=? where empId=?");
		stat.setString(1, empName);
		stat.setString(2, empAddress);
		stat.setInt(3, salary);
		stat.setInt(4, empId);
		int rowsAffected = stat.executeUpdate();
		
		System.out.println(rowsAffected+"Updated Successfully");
		
		}

	}