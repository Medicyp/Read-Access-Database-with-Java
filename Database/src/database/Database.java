package database;

import java.sql.*;

public class Database {
	public static void main(String []args) {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Djinn/Documents/Word/Divers/Geek/Java/Projet 8 - Access to Java/BookStore.accdb");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from Book");
					while(rs.next()) {
						System.out.println(rs.getString(1)+ " "+ rs.getString(2)+ " "+ rs.getString(3));
					}
					con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
