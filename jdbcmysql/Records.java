package jdbcmysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Records {

	static final String DB_URL = "jdbc:mysql://localhost:3306/company1";
		static final String USER = "root";
		static final String PASS = "";
	
	public static void main(String[] args) {	
		try (Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt = conn.createStatement();
				) 
		{
			System.out.println("Inserting records into the table");
			String sql = "INSERT INTO studs VALUES (100,'sam',18000,'trichy')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO studs VALUES (101,'nick',20000,'Tanjore')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO studs VALUES (102,'caleb',38000,'chennai')";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO studs VALUES (103,'cesar',28000,'LA')";
			stmt.executeUpdate(sql);
			System.out.println("Inserted records into the table...");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
