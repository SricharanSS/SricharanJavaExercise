package MohanShopping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ItemMasterDAOImpl implements ItemMasterDAO{

	@Override
	public ItemMaster get(int id) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "SELECT * FROM ITEM_MASTER WHERE item_no = "+id+";";
		ResultSet rs = stmt.executeQuery(query);
		
		ItemMaster itemMaster = null;
		if(rs.next()) {
			itemMaster = new ItemMaster(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
		}
		
		return itemMaster;
	}

	@Override
	public int insert(ItemMaster itemMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		
		String query = "INSERT INTO ITEM_MASTER VALUES("+itemMaster.getItemNo()+", '"+itemMaster.getItemDes()+"' ,"+itemMaster.getItemPrice()+","+itemMaster.getItemUnit()+");";
		int n = stmt.executeUpdate(query);
		
		return n;
	}

	@Override
	public int delete(ItemMaster itemMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "DELETE FROM ITEM_MASTER WHERE item_no = "+itemMaster.getItemNo()+";";
		int n = stmt.executeUpdate(query);
		
		return n;
	}

	@Override
	public int update(ItemMaster itemMaster) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = Database.getConnection();
		if(con == null) {
			System.out.println("Connection not Succesful");
			System.exit(0);
		}
		Statement stmt = con.createStatement();
		String query = "UPDATE ITEM_MASTER SET item_des = '"+itemMaster.getItemDes()+"' , item_price = "+itemMaster.getItemPrice()+", item_unit = "+itemMaster.getItemUnit()+" WHERE item_no = "+itemMaster.getItemNo()+";";
		int n = stmt.executeUpdate(query);
		
		return n;
	}

}
