package jdbc; //PreparedStatement 

import java.sql.*;

public class JDBCDemo4 {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("Jdbc:mysql:///student", "root", "12345");

			Statement stmt = con.createStatement();
			String query = "insert into list(id,name) values(?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, 103);

			pstmt.setString(2, "Aashik");
			int i = pstmt.executeUpdate();
			if (i > 0) {

				System.out.println("Inserted");

			}

		} catch (Exception e) {

			System.out.println("Exception has occured " + e);
		}
	}

}
