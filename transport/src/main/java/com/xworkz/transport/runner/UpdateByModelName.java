package com.xworkz.transport.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateByModelName {

	public static void main(String[] args) {


		
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		
		try
		{
			et.begin();
			
			Query query=entityManager.createNamedQuery("UpdateByModelName");
			query.setParameter("Ec", 1700.0).setParameter("byModelName","Honda Jazz");
			int value=query.executeUpdate();
			if(value>0)
			{
				System.out.println("updated");
			}
			else
			{
				System.out.println("not updated");
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
