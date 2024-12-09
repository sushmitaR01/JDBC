package com.xworkz.transport.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteByNameAndManufacturer {

	public static void main(String[] args) {


		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
		try
		{
			et.begin();
			
			Query query=entityManager.createNamedQuery("deleteByNameAndManufacturer");
			query.setParameter("byModelName", "Honda Jazz").setParameter("byManufacturer","Honda");
			int value=query.executeUpdate();
			if(value>0)
			{
				System.out.println("deletd");
			}
			else
			{
				System.out.println("not deleted");
			}
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
