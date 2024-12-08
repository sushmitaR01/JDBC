package com.xworkz.airport.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteByNameAndAge {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		try {
			eTrans.begin();
			Query query = eManager.createNamedQuery("deleteByNameAndAge");
			query.setParameter("name", "Vrushank");
			query.setParameter("age", 56);
			int rowsDeleted = query.executeUpdate();
			eTrans.commit();
			System.out.println("Number of records deleted: " + rowsDeleted);
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
