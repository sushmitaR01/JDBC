package com.xworkz.transport.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.transport.entity.VehicleEntity;

public class GetAllByIdAndModelName {

	public static void main(String[] args) {


		EntityManagerFactory emf=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction et=entityManager.getTransaction();
		Query query=entityManager.createNamedQuery("findAllByIdAndModelName");
		query.setParameter("byId", 3).setParameter("byModelName", "BMW i8");
		List<VehicleEntity> list=query.getResultList();
		for(VehicleEntity ve:list)
		   System.out.println(ve.toString());
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
