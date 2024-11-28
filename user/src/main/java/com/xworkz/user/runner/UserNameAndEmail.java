package com.xworkz.user.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserNameAndEmail {

	public static void main(String[] args) {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();

	        try {
	            et.begin();
	            em.createQuery("UPDATE UserDto l SET l.name = :newName, l.email = :newEmail WHERE l.phoneNumber = '7795672341'")
	              .setParameter("newName", "keerti")
	              .setParameter("newEmail", "keerti@gmail.com")
	              .executeUpdate();
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


