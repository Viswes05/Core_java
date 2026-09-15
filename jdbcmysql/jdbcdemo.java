package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcdemo {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/";
			static final String USER = "root";
			static final String PASS = "";
	
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt = conn.createStatement();
				)
		{
			String sql = "CREATE DATABASE COMPANY1";
			stmt.execute(sql);
			System.out.println("Database created succesfully...");
		}
		catch ( SQLException e)
		{
			e.printStackTrace();
		}
		
				
	}

}
