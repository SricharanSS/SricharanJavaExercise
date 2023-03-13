package MohanShopping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InvoiceTransDAOImpl implements InvoiceTransDAO{

	@Override
	public InvoiceTrans get(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "SELECT * FROM INVOICE_TRANS WHERE invoice_no = "+id+";";
		ResultSet rs = stmt.executeQuery(query);
		
		InvoiceTrans invoiceTrans = null;
		if(rs.next()) {
			invoiceTrans = new InvoiceTrans(rs.getInt(1), rs.getInt(2), rs.getInt(3));
		}
		
		return invoiceTrans;
	}

	@Override
	public int insert(InvoiceTrans invoiceTrans) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "INSERT INTO INVOICE_TRANS VALUES("+invoiceTrans.getInvoiceNo()+","+invoiceTrans.getItemNo()+","+invoiceTrans.getItemQty()+");";
		int n = stmt.executeUpdate(query);
		
		return n;
	}

	@Override
	public int delete(InvoiceTrans invoiceTrans) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "DELETE FROM INVOICE_TRANS WHERE invoice_no = "+invoiceTrans.getInvoiceNo()+";";
		int n = stmt.executeUpdate(query);
		return n;
	}

	@Override
	public int update(InvoiceTrans invoiceTrans) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "UPDATE INVOICE_TRANS SET item_no = "+invoiceTrans.getItemNo()+", item_qty = "+invoiceTrans.getItemQty()+" WHERE invoice_no = "+invoiceTrans.getInvoiceNo()+";";
		int n = stmt.executeUpdate(query);
		return n;
	}

}
