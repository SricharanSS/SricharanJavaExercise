package MohanShopping;

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		
		/* ItemMaster */
		
//		ItemMasterDAO itemMasterDAO = new ItemMasterDAOImpl();
//		
//		ItemMaster itemMaster = null;
//		try {
//			itemMaster = itemMasterDAO.get(1);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(itemMaster.getItemNo()+":"+itemMaster.getItemDes()+":"+itemMaster.getItemPrice()+":"+itemMaster.getItemUnit());
//		
//		itemMaster.setItemPrice(30000);
//
//		int n=0;
//		try {
//			n = itemMasterDAO.update(itemMaster);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		if(n == 1) {
//			System.out.println("Succesful");
//		}
//		
//		ItemMaster itemMaster1 = new ItemMaster(5,"Earphones",800,30);
//		
//		int n = 0;
//		try {
//			n =itemMasterDAO.insert(itemMaster1);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		if(n == 1) {
//			System.out.println("Successfull");
//		}
		
		
		/* InvoiceTrans */
		
		
//		// SELECT statememt 
//		InvoiceTransDAO invoiceTransDAO = new InvoiceTransDAOImpl();
//		InvoiceTrans invoiceTrans = null;
//		try {
//			invoiceTrans = invoiceTransDAO.get(101);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(invoiceTrans.getInvoiceNo()+":"+invoiceTrans.getItemNo()+":"+invoiceTrans.getItemQty());
//		
//		// DELETE statement
//		int n1 = 0;
//		try {
//			n1 = invoiceTransDAO.delete(invoiceTrans);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		//INSERT statement
//		int n2 = 0;
//		invoiceTrans = new InvoiceTrans(101,2,2);
//		try {
//			n2 = invoiceTransDAO.insert(invoiceTrans);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(n2 == 1) {
//			System.out.println("Successful");
//		}
//		
//		//UPDATE statement
//		invoiceTrans.setItemQty(3);
//		int n3 = 0;
//		try {
//			n3 = invoiceTransDAO.update(invoiceTrans);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}
}
