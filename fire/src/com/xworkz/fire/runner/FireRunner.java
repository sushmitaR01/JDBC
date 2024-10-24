package com.xworkz.fire.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FireRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/shoe";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into sandles_table values (20,' Clarks','1000Rs','blue')";

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, userName, password);

			Statement statement = connection.createStatement();
			int updatedQuery = statement.executeUpdate(insertQuery);
			if (updatedQuery > 0) {
				System.out.println("This is saved");
			} else {
				System.err.println("This is not saved");
			}
		} catch (SQLException s) {

			s.printStackTrace();
		}
	}

}
