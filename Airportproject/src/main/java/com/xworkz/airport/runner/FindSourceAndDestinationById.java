package com.xworkz.airport.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindSourceAndDestinationById {

	public static void main(String[] args) {

	
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		try {
			eT.begin();
			Query query = eM.createNamedQuery("findsourceAnddestinationById");
			query.setParameter("id", 1); 
											
			List<Object[]> results = query.getResultList();
			for (Object[] result : results) {
				String source = (String) result[0];
				String destination = (String) result[1];
				System.out.println("Source: " + source + ", Destination: " + destination);
			}
			eT.commit();
			System.out.println("Query executed successfully.");
		} catch (Exception e) {
			if (eT.isActive()) {
				System.out.println("Rolling back transaction...");
				eT.rollback();
				System.out.println("Transaction rolled back due to error.");
			}
			e.printStackTrace();
		} finally {
			eM.close();
			eMF.close();
		}
	}

}
