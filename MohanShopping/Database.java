package MohanShopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	private Database() {
		
	}
	
	public static Connection getConnection() {
	
		/* Driver for MySQL */
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		/* Connection for MySQL */
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/e9","root","#PASSWORD:mysql");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
}
