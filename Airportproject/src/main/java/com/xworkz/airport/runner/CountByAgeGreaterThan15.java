package com.xworkz.airport.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CountByAgeGreaterThan15 {

	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		try {
			eT.begin();
			Query query = eM.createNamedQuery("countByAgeGreaterThan15");
			Long count = (Long) query.getSingleResult();
			eT.commit();
			System.out.println("Number of records with age greater than 15: " + count);
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
