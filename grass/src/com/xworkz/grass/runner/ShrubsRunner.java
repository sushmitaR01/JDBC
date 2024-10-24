package com.xworkz.grass.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ShrubsRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/grocery";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into grocery_store values (20,'cereal ','500Rs',6)";

		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			int checkedquery = statement.executeUpdate(insertQuery);
			if (checkedquery > 0) {
				System.out.println("This is saved");
			} else {
				System.err.println("This is not  saved");
			}

		} catch (SQLException s) {

			s.printStackTrace();
		}

	}

}
