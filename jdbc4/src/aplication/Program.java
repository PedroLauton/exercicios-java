package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE (DepartmentId = ?)");
			
			st.setDouble(1, 3000.99);
			st.setInt(2, 2);
			int linhas = st.executeUpdate();
			System.out.println(linhas);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}

