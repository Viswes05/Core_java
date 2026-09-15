package jdbcmysql;

import java.sql.*;

public class Selectdb {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/company1";
		static final String USER = "root";
		static final String PASS = "";
		
	public static void main(String[] args) {
		System.out.println("Connected to a selected database...");
		try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);)
		{
			System.out.println("Connected database succsesfully...");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

}
