package jdbc;

import java.sql.*;

public class InsertingTable {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///student", "root", "12345");
			Statement obj = con.createStatement();
			String query = "insert into list(id,name) value(1,'ajith kumar')";
//			String query = "delete from list where id=1";
			int i = obj.executeUpdate(query);
			if (i > 0) {
				System.out.println("---------Record Inserted--------");
			} else {
				System.out.println("------Error------");
			}
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("Exception has occured " + e);
		}

	}

}
