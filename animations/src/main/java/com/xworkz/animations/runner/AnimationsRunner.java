package com.xworkz.animations.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.animations.dto.AnimaEntity;

public class AnimationsRunner {
	public static void main(String[] args) {

		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction at = entityManager.getTransaction();

		try {
			at.begin();
			AnimaEntity animaEntity = new AnimaEntity();
			animaEntity.setId(5);
			animaEntity.setSeasons(11);
			animaEntity.setNoOfCharacters(22);
			animaEntity.setVersions(10);
			animaEntity.setRatings(10);
			animaEntity.setPrice(900);
			animaEntity.setName("Disney's ");
			animaEntity.setTheams("Horrer story");
			animaEntity.setAdultFocus("yes");
			animaEntity.setLengthOfEpisodes("25minutes");

			entityManager.persist(animaEntity);
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
