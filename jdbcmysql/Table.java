package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/company1";
			static final String USER = "root";
			static final String PASS = "";
	
	public static void main(String[] args) {
		try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt = conn.createStatement();
				)
		{
			String sql = "create table studs (id int primary key,name varchar(30),fees int,address varchar(50))";
			stmt.execute(sql);
			System.out.println("Database Updated succesfully...");
		}
		catch ( SQLException e)
		{
			e.printStackTrace();
		}
		
				
	}

}
