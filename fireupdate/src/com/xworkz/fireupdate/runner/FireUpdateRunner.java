package com.xworkz.fireupdate.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FireUpdateRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/shoe";
		String userName = "root";
		String password = "Xworkzodc@123";

		String updateQuery1 = "update sandles_table set sandle_color = ' Oliva Aqua' WHERE id=1";
		String updateQuery2 = "update sandles_table set sandle_color = '  Maroon' WHERE id=2";
		String updateQuery3 = "update sandles_table set sandle_color = '  Purple' WHERE id=3";
		String updateQuery4 = "update sandles_table set sandle_color = '  Gold Tomato' WHERE id=4";
		String updateQuery5 = "update sandles_table set sandle_color = '  Bronze' WHERE id=5";
		String updateQuery6 = "update sandles_table set sandle_color = '  Navy blue' WHERE id=6";
		String updateQuery7 = "update sandles_table set sandle_color = '  Cyan' WHERE id=7";
		String updateQuery8 = "update sandles_table set sandle_color = '  orange' WHERE id=8";
		String updateQuery9 = "update sandles_table set sandle_color = '  dark blue' WHERE id=9";
		String updateQuery10 = "update sandles_table set sandle_color = '  black' WHERE id=10";

		try (Connection connection = DriverManager.getConnection(url, userName, password)) {

			Statement statement = connection.createStatement();

			int value = statement.executeUpdate(updateQuery1);
			int value1 = statement.executeUpdate(updateQuery2);
			int value2 = statement.executeUpdate(updateQuery3);
			int value3 = statement.executeUpdate(updateQuery4);
			int value4 = statement.executeUpdate(updateQuery5);
			int value5 = statement.executeUpdate(updateQuery6);
			int value6 = statement.executeUpdate(updateQuery7);
			int value7 = statement.executeUpdate(updateQuery8);
			int value8 = statement.executeUpdate(updateQuery9);
			int value9 = statement.executeUpdate(updateQuery10);

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
