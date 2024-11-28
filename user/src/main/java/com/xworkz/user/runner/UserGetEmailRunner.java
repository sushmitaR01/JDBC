package com.xworkz.user.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserGetEmailRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<String> emails = em
				.createQuery("SELECT l.email FROM UserDto l WHERE l.name LIKE 'S%' OR l.name LIKE 'N%'", String.class)
				.getResultList();
		for (String email : emails) {
			System.out.println("Email: " + email);
		}

		try {
			et.begin();

			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}
	}

}
