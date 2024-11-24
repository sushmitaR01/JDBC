package com.xworkz.bag.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.bag.dto.BagEntity;



public class BagRunner {
	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction at = entityManager.getTransaction();

		try {
			at.begin();
			BagEntity bagEntity = new BagEntity();
			bagEntity.setId(5);
			bagEntity.setNoOfZips(5);
			bagEntity.setNoOfCompartments(3);
			bagEntity.setPrice(5000);
			bagEntity.setRatings(10);
			bagEntity.setReviws(" Excellent");
			bagEntity.setName("Grey ");
			bagEntity.setColors(" aristocraft");
			bagEntity.setSize("L");
			bagEntity.setLaptopCompartment("Yes");

			entityManager.persist(bagEntity);
			at.commit();

		}

		catch (Exception e) {
			e.printStackTrace();

		} finally {
			entityManager.close();
			eMF.close();
		}
	}
}
