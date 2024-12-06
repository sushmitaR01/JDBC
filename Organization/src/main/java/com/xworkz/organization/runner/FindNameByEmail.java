package com.xworkz.organization.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

public class FindNameByEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		// find name by Email

		Query query = eManager.createNamedQuery("findNameByEmail");
		query.setParameter("getEmail", "shreya@gmail.com");
		Object obj = query.getSingleResult();
		String str = (String) obj;
		System.out.println("Values : " + str);

	}

}
