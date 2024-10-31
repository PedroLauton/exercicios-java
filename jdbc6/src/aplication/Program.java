package aplication;

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
			int row1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			int x = 1;
			if(x < 2) {
				throw new SQLException("Fake erro");
			}
	
			int row2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			conn.commit();
		} catch (SQLException e) {			try {
				conn.rollback();
				throw new DbException("Erro, transação não realizada: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro enquanto tentava o rollback: " + e.getMessage());
			}
			
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}

