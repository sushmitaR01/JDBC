package com.xworkz.transport.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetNameAndManufacturerById {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		Query query=entityManager.createNamedQuery("findNameAndManufacturerById");
		query.setParameter("byId", 5);
		List<Object[]> object=query.getResultList();
		for(Object[] obj:object)
		{
			System.out.println((String)obj[0]);
			System.out.println((String)obj[1]);
		}
		try
		{
			et.begin();
			et.commit();
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		finally {
			emf.close();
			entityManager.close();
		}

	
	}

}
