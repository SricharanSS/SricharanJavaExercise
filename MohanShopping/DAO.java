package MohanShopping;

import java.sql.SQLException;

public interface DAO<T> {
	T get(int id) throws SQLException;
	
	int insert(T t) throws SQLException;
	
	int delete(T t) throws SQLException;
	
	int update(T t) throws SQLException;
}
