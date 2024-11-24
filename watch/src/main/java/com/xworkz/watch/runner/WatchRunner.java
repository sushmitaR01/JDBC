package com.xworkz.watch.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.watch.dto.WatchEntity;



public class WatchRunner {

	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction at = entityManager.getTransaction();

		try {
			at.begin();
			WatchEntity watchEntity = new WatchEntity();
			watchEntity.setId(5);
			watchEntity.setPrice(5995);
			watchEntity.setRatings(10);
			watchEntity.setReviws("Excellent");
			watchEntity.setName("Titan");
			watchEntity.setColors("Black");
			watchEntity.setWaterResistance("yes");
			watchEntity.setMaterial("Stainless stell");
			watchEntity.setDisplays("analogue");
			watchEntity.setPowderSource("battery");

			entityManager.persist(watchEntity);
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
