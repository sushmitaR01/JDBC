package com.xworkz.firedelete.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FireDeleteRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/shoe";
		String userName = "root";
		String password = "Xworkzodc@123";

		String deleteQuery1 = "delete from sandles_table where id=11";
		String deleteQuery2 = "delete from sandles_table where id=12";
		String deleteQuery3 = "delete from sandles_table where id=13";
		String deleteQuery4 = "delete from sandles_table where id=14";
		String deleteQuery5 = "delete from sandles_table where id=15";
		String deleteQuery6 = "delete from sandles_table where id=16";
		String deleteQuery7 = "delete from sandles_table where id=17";
		String deleteQuery8 = "delete from sandles_table where id=18";
		String deleteQuery9 = "delete from sandles_table where id=19";
		String deleteQuery10 = "delete from sandles_table where id=20";
		try (Connection connection = DriverManager.getConnection(url, userName, password)) {

			Statement statement = connection.createStatement();

			int value = statement.executeUpdate(deleteQuery1);
			int value1 = statement.executeUpdate(deleteQuery2);
			int value2 = statement.executeUpdate(deleteQuery3);
			int value3 = statement.executeUpdate(deleteQuery4);
			int value4 = statement.executeUpdate(deleteQuery5);
			int value5 = statement.executeUpdate(deleteQuery6);
			int value6 = statement.executeUpdate(deleteQuery7);
			int value7 = statement.executeUpdate(deleteQuery8);
			int value8 = statement.executeUpdate(deleteQuery9);
			int value9 = statement.executeUpdate(deleteQuery10);

			if (value > 0) {
				System.out.println("This is saved");
			} else {
				System.err.println("This is not saved");
			}
		} catch (SQLException s) {

			s.printStackTrace();
		}

	}

}
