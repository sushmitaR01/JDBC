package com.xworkz.user.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserNameAndPhoneNumber {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
        List<Object[]> results = em.createQuery("SELECT l.name ,l.phoneNumber FROM UserDto l WHERE l.age > 25").getResultList();
        for (Object[] result : results) {
            String name = (String) result[0];
            String phoneNumber = (String) result[1];
            System.out.println("Name: " + name + ", Phone Number: " + phoneNumber);
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

