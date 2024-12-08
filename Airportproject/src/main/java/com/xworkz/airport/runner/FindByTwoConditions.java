package com.xworkz.airport.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindByTwoConditions {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		try {
			eTrans.begin();
			Query query = eManager.createNamedQuery("findByTwoConditions");
			query.setParameter("condition1", "condition1Value");
			query.setParameter("condition2", "condition2Value");
			List<Object[]> results = query.getResultList();
			for (Object[] result : results) {
				String name = (String) result[0];
				int age = (int) result[1];
				Long phoneNo = (Long) result[2];
				String address = (String) result[3];
				Short rating = (Short) result[4];
				String source = (String) result[5];
				String destination = (String) result[6];
				Character gender = (Character) result[7];
				System.out.println("Name: " + name);
				System.out.println("Age: " + age);
				System.out.println("Phone No: " + phoneNo);
				System.out.println("Address: " + address);
				System.out.println("Rating: " + rating);
				System.out.println("source: " + source);
				System.out.println("destination : " + destination);
				System.out.println("gender: " + gender);
			}
			eTrans.commit();
			System.out.println("Query executed successfully.");
		} catch (Exception e) {
			if (eTrans.isActive()) {
				System.out.println("Rolling back transaction...");
				eTrans.rollback();
				System.out.println("Transaction rolled back due to error.");
			}
			e.printStackTrace();
		} finally {
			eManager.close();
			emFactory.close();
		}
	}
}
