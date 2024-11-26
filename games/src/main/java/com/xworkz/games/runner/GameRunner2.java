package com.xworkz.games.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.games.dto.GameDto;

public class GameRunner2 {
	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction at = entityManager.getTransaction();

		try {
			at.begin();
			Integer id = 10;
			GameDto gameDto = new GameDto();
			GameDto value = entityManager.find(GameDto.class, id);
			entityManager.remove(value);

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
