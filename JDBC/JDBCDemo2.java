package jdbc; //INSERTING RECORDS

import java.sql.*;

public class JDBCDemo2 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///student", "root", "12345");
			Statement stmt = con.createStatement();
			String query = "insert into list(id,name)values(101,'ravi')";
			int i = stmt.executeUpdate(query);
			if (i > 0) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println("Exception has occurred" + e);
		}

	}

}
