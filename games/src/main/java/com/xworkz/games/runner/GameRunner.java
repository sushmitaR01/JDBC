package com.xworkz.games.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.games.dto.GameDto;

public class GameRunner {
	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction at = entityManager.getTransaction();

		try {
			at.begin();
			GameDto gameDto = new GameDto(7, "table tennis", 2);

			entityManager.persist(gameDto);

			at.commit();

		}

		catch (Exception e) {
			if (at.isActive()) {
				at.rollback();
			}
			e.printStackTrace();

		} finally {
			entityManager.close();
			eMF.close();
		}
	}
}
