package com.xworkz.cosmetic.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cosmetic.dto.PerfumDto;

public class FeatchingRunner {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		Integer id = 2;

		PerfumDto dto = eManager.find(PerfumDto.class, id);

		System.out.println("Value of ID : " + dto.getProductName());

		try {
			eTrans.begin();
			eTrans.commit();
		} catch (Exception e) {
			if (eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		} finally {
			eManager.close();
			emFactory.close();
		}

	}

}
