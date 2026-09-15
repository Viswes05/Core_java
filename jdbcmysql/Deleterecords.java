package jdbcmysql;

import java.sql.*;

public class Deleterecords {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/company1";
		static final String USER = "root";
		static final String PASS = "";
		static final String QUERY = "SELECT id, Name, Fees, Address FROM studs";
		
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt = conn.createStatement();
				)
		{
			String sql = "DELETE FROM studs WHERE id >=101";
			stmt.executeUpdate(sql);
			 ResultSet rs = stmt.executeQuery(QUERY);
			while(rs.next())
			{
				System.out.println("ID: " + rs.getInt("id"));
				System.out.println(", Name " + rs.getString("Name"));
				System.out.println(", Fees " + rs.getInt("Fees"));
				System.out.println(", Address " + rs.getString("Address"));
			}
			rs.close();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
