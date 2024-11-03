package com.xworkz.breaddelete.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BreadDeleteRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hospital";
		String userName = "root";
		String password = "Xworkzodc@123";
		String deleteQuery1 = "delete from table_hospital where id=11 ";
		String deleteQuery2 = "delete from table_hospital where id=20 ";
		String deleteQuery3 = "delete from table_hospital where id=102 ";
		String deleteQuery4 = "delete from table_hospital where id=103 ";
		String deleteQuery5 = "delete from table_hospital where id=104";
		String deleteQuery6 = "delete from table_hospital where id=105";
		String deleteQuery7 = "delete from table_hospital where id=106";
		String deleteQuery8 = "delete from table_hospital where id=107";
		String deleteQuery9 = "delete from table_hospital where id=108";
		String deleteQuery10 = "delete from table_hospital where id=109 ";

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
