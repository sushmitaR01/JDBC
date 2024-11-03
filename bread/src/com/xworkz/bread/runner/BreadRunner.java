package com.xworkz.bread.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BreadRunner {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hospital";
		String userName = "root";
		String password = "Xworkzodc@123";
		String insertQuery = "insert into table_hospital values (01,' apollo','Dr.ramesh','dermatologist'),(02,' forties','Dr.kavitha','gynacologist'),(03,' manipal','Dr.kaviraj','orthopedic'),(04,' HCG','Dr.sanjay','cardiologist'),(05,' sparsh','Dr.manoj','endocrinologist'),(06,' SDM','Dr.kruthi','gynecologist'),(07,' apollo','Dr.suresh','neurologist'),(08,' K.R patl','Dr.Shreya','gastronterologist'),(09,' kannur hospital','Dr.karuna','dermatologist'),(10,' kalpavruksha','Dr.gururaj','opthalmologist'),(11,' apollo','Dr.sanjana','family physician'),(102,' cuties','Dr.mahesh',' physician'),(103,' people','Dr.neha',' hematologist'),(104,' KMC','Dr.suman',' urologist'),(105,' family tree','Dr.savita',' anesthesiologist'),(106,'tree','Dr.samarth','oncologist'),(107,'Nandi','Dr.yamuna','veterinarian'),(108,'SFB','Dr.Girish',' internal medicine'),(109,'NMR','Dr.savitra','surgen'),(20,'forties','Dr.sueep',' dentist')";

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
