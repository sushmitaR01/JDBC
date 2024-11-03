package com.xworkz.grassupdate.runnner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GrassUpdateRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/grocery";
		String userName = "root";
		String password = "Xworkzodc@123";
		String updateQuery1 = "update grocery_store set grocery_items = '  peanuts' WHERE id=1";
		String updateQuery2 = "update grocery_store set grocery_items = '  sauces' WHERE id=2";
        String updateQuery3 = "update grocery_store set grocery_items = '  cheeses' WHERE id=3";
		String updateQuery4 = "update grocery_store set grocery_items = '  beans' WHERE id=4";
        String updateQuery5 = "update grocery_store set grocery_items = '  lentils' WHERE id=5";
        String updateQuery6 = "update grocery_store set grocery_items = '  salads' WHERE id=6";
        String updateQuery7 = "update grocery_store set grocery_items = '  spices' WHERE id=7";
        String updateQuery8 = "update grocery_store set grocery_items = '  milk' WHERE id=8";
		String updateQuery9 = "update grocery_store set grocery_items = '  spourts' WHERE id=9";
		String updateQuery10 = "update grocery_store set grocery_items = '  broccoli' WHERE id=10";


		

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
