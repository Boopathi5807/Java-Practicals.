package jdbc; //EXTRACTING RECORDS

import java.sql.*;

public class JDBCDemo3 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("Jdbc:mysql:///student", "root", "12345");
			Statement stmt = con.createStatement();
			String query = "select id,name from list";
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("Id==" + rs.getInt("id") + "----Name--" + rs.getString("name"));
			}
		} catch (Exception e) {

			System.out.println("Exception has occured " + e);

		}

	}

}
