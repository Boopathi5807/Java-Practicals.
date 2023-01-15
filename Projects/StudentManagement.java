
package project;

import java.sql.*;

import java.util.Scanner;

public class StudentManagement {

	public static class StudentManagementSystem {

		// ******************* ADD STUDENT *******************

		public static void addStudent(int sId, String sName, String sAddress)
				throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///school", "root", "12345");
			String query = "insert into student values(?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, sId);
			st.setString(2, sName);
			st.setString(3, sAddress);
			st.executeUpdate();

		}

		// ******************* DISPLAY DETAILS *******************

		public static void displayDetails() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///school", "root", "12345");
			String query1 = "Select * from student";
			Statement st = con.createStatement();
			ResultSet r = st.executeQuery(query1);
			System.out.println("********View Student Detail********" + "\n");
			while (r.next()) {
				System.out.println(r.getInt(1) + "   " + r.getString(2) + "   " + r.getString(3));
			}
			System.out.println("\n");
		}

		// ******************* VIEW STUDENT *******************

		public static void viewStudent(int sId) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///school", "root", "12345");
			String query2 = "Select * from student where sId=?";
			PreparedStatement st = con.prepareStatement(query2);
			st.setInt(1, sId);
			ResultSet r = st.executeQuery();
			while (r.next()) {
				System.out.println(r.getInt(1) + "   " + r.getString(2) + "   " + r.getString(3));
			}
		}

		// ******************* UPDATE STUDENT *******************

		public static void updateStudent(int sId, String sName, String sAddress)
				throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///school", "root", "12345");
			String sql = "update student set sName=?,sAddress=? where sId=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(3, sId);
			st.setString(1, sName);
			st.setString(2, sAddress);
			int n = st.executeUpdate();
			System.out.println("Record Updated");
		}

		// ******************* DELETE STUDENT *******************

		public static void deleteStudent(int sId) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///school", "root", "12345");
			String ashwini = "delete from student  where sId=?";
			PreparedStatement st = con.prepareStatement(ashwini);
			st.setInt(1, sId);
			st.executeUpdate();
			System.out.println("Record Deleted");
		}

		// ******************* MENU *******************

		public static void menu() {
			String choice;
			System.out.println("\n\n*****WELCOME TO STUDENT MANAGEMENT SYSTEM*****");
			System.out.println("\nEnter ");
			System.out.println("1:Add Student");
			System.out.println("2:Display Student's Details");
			System.out.println("3:View Particular Student");
			System.out.println("4:Update Student");
			System.out.println("5:Delete Student");
			System.out.println("6:To Exit");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextLine();
		}

		// ******************* OPERATIONS USING SWITCH CASE *******************

		public static void operation(int choice) throws ClassNotFoundException, SQLException {
			Scanner sc = new Scanner(System.in);
			switch (choice) {
			case 1:
				System.out.println("Enter Student ID");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student Name");
				String name = sc.nextLine();
				System.out.println("Enter Student Address");
				String address = sc.nextLine();
				addStudent(id, name, address);
				System.out.println("Records Inserted");
				break;
			case 2:
				displayDetails();
				break;
			case 3:
				System.out.println("Enter the Student Id");
				int sid = sc.nextInt();
				viewStudent(sid);
				break;
			case 4:
				System.out.println("Enter the Student Id to Update");
				int sId = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student Name");
				String sName = sc.nextLine();
				System.out.println("Enter Student Address");
				String sAddress = sc.nextLine();
				updateStudent(sId, sName, sAddress);
				break;
			case 5:
				System.out.println("Enter the Student Id to Delete");
				int Sid = sc.nextInt();
				sc.nextLine();
				deleteStudent(Sid);
				break;
			}
		}

		// ******************* MAIN METHOD *******************

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Scanner sc = new Scanner(System.in);
			String userId = "root";
			int password = 12345;
			System.out.println("Enter User ID");
			String uId = sc.nextLine();
			if (uId.equals(userId)) {
				System.out.println("Enter the Password");
				int pass = sc.nextInt();
				if (pass == password) {
					System.out.println("\nLogin Successfuly...");
					do {
						menu();
						System.out.println("Enter Your Choice ");
						int ch = sc.nextInt();
						if (ch == 6) {
							System.out.println("Thank You 🙏.. ");
							break;
						}
						operation(ch);

					} while (true);
				} else
					System.out.println("Invalid Password! Try Again");
			} else
				System.out.println("Invalid user Id! Try Again");
		}
	}
}
