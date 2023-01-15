package jdbc; // CREATING TABLE LIST

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///student", "root", "12345");

			Statement stmt = con.createStatement();

			String query = "create table list(id int,name varchar(20))";
			stmt.executeUpdate(query);
		} catch (Exception e) {

			System.out.println("Exception has occured " + e);
		}

	}

}
