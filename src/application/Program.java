package application;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import db.DB;
import db.DbException;


public class Program {

	public static void main(String[] args) {

		Connection conn = null;

		Statement st = null;
		
		try { 
			conn = DB.getConnection();
			conn.setAutoCommit(false);
			st = conn.createStatement();
			int row1 = st.executeUpdate(""
					+ "UPDATE seller "
					+ "SET BaseSalary = 2090 "
					+ "WHERE DepartmentId = 1");
				
			//falha ficticia
			//int x = 1;
			//if (x<2) {
			//	throw new SQLException("Fake Error!!");
			//}
			
			int row2 = st.executeUpdate(""
					+ "UPDATE seller "
					+ "SET BaseSalary = 3090 "
					+ "WHERE DepartmentId = 2");
			conn.commit();
			
			System.out.println("row1 = " + row1);
			System.out.println("row2 = " + row2);
			

		
		}
		catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! " + e.getMessage());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				throw new DbException("Error trying to rollback transaction. " + e.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
