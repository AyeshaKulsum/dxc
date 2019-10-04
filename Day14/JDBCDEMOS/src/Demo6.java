
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//insert dynamic values
public class Demo6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id");
		int employeeId= sc.nextInt();
		System.out.println("Enter emp name");
		String employeeName= sc.next();
		System.out.println("Enter emp address");
		String employeeAddress= sc.next();
		System.out.println("Enter bill amount");
		int billAmount= sc.nextInt();
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Loaded");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxc", "root", "root");
		
		System.out.println("Connected");
		
		PreparedStatement stat = con.prepareStatement("insert into employee values(?,?,?,?)");
		stat.setInt(1,employeeId);
		stat.setString(2, employeeName);
		stat.setString(3, employeeAddress);
		stat.setInt(4, billAmount);
		int rowsAffected = stat.executeUpdate();
		
		System.out.println(rowsAffected+"Inserted Successfully");
		
		}

	}