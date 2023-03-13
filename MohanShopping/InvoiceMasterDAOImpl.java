package MohanShopping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InvoiceMasterDAOImpl implements InvoiceMasterDAO{

	@Override
	public InvoiceMaster get(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "SELECT * FROM INVOICE_MASTER WHERE invoice_no = "+id+";";
		ResultSet rs = stmt.executeQuery(query);
		
		InvoiceMaster invoiceMaster = null;
		if(rs.next()) {
			invoiceMaster = new InvoiceMaster(rs.getInt(1), rs.getDate(2), rs.getInt(3));
		}
		return invoiceMaster;
	}

	@Override
	public int insert(InvoiceMaster invoiceMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "INSERT INTO INVOICE_MASTER VALUES("+invoiceMaster.getInvoiceNo()+","+invoiceMaster.getDate()+","+invoiceMaster.getCustomerId()+");";
		int n = stmt.executeUpdate(query);
		return n;
	}

	@Override
	public int delete(InvoiceMaster invoiceMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "DELETE FROM INVOICE_MASTER WHERE invoice_no="+invoiceMaster.getInvoiceNo()+";";
		int n = stmt.executeUpdate(query);
		return n;
	}

	@Override
	public int update(InvoiceMaster invoiceMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "UPDATE INVOICE_MASTER SET date = ' "+invoiceMaster.getDate()+"' , customer_id = "+invoiceMaster.getCustomerId()+" WHERE invoice_no = "+invoiceMaster.getInvoiceNo()+";";
		int n = stmt.executeUpdate(query);
		return n;
	}

}
