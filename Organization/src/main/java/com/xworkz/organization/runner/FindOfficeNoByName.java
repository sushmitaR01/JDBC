package com.xworkz.organization.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindOfficeNoByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		// find officeNo By Name
		Query query=eManager.createNamedQuery("findOfficeNoByName");
		query.setParameter("setName", "Priya");
		Object obj= query.getSingleResult();
		Long ref= (Long)obj;
		System.out.println("Value of the OfficeNo :"+ref);

	}

}
