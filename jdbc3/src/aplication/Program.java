package aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement(
					"INSERT INTO seller " +
					"(Name,Email,BirthDate,BaseSalary,DepartmentId)" +
					"VALUES" +
					"(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);
			st.setString(1, "Pedro Lauton");
			st.setString(2, "pedro@gmail.com");
			st.setDate(3, new java.sql.Date(sd.parse("13/02/2005").getTime()));
			st.setDouble(4, 20000.00);
			st.setInt(5, 1);
			
			/*st = conn.prepareStatement("INSERT INTO department (Name) VALUES ('D1'),('D2')", Statement.RETURN_GENERATED_KEYS);*/

			int linhasAfetadas = st.executeUpdate();
			
			if(linhasAfetadas > 0) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					System.out.println("Id do novo vendedor: " + rs.getInt(1));
				}
			} else {
				System.out.println("Sem inserções!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
