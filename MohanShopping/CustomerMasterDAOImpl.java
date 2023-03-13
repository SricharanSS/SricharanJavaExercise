package MohanShopping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerMasterDAOImpl implements CustomerMasterDAO{

	@Override
	public CustomerMaster get(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "SELECT * FROM CUSTOMER_MASTER WHERE customer_id = "+id+";";
		ResultSet rs = stmt.executeQuery(query);
		
		CustomerMaster customerMaster = null;
		if(rs.next()) {
			customerMaster = new CustomerMaster(rs.getInt(1), rs.getString(2), rs.getString(3));
		}
		
		return customerMaster;
	}

	@Override
	public int insert(CustomerMaster customerMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "INSERT INTO CUSTOMER_MASTER VALUES("+customerMaster.getCustomerId()+","+customerMaster.getCustomerName()+","+customerMaster.getCustomerAddress()+");";
		int n = stmt.executeUpdate(query);
		return n;
	}

	@Override
	public int delete(CustomerMaster customerMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "DELETE FROM CUSTOMER_MASTER WHERE customer_id = "+customerMaster.getCustomerId()+";";
		int n = stmt.executeUpdate(query);
		return n;
	}

	@Override
	public int update(CustomerMaster customerMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "UPDATE CUSTOMER_MASTER SET customer_name = '"+customerMaster.getCustomerName()+"', customer_address = '"+customerMaster.getCustomerAddress()+"' WHERE customer_id = "+customerMaster.getCustomerId()+";";
		int n = stmt.executeUpdate(query);
		return n;
	}

}
