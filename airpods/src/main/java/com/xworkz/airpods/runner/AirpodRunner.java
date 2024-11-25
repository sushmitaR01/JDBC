package com.xworkz.airpods.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.airpods.dto.AirpodEntity;


public class AirpodRunner {
	public static void main(String[] args) {
		
	
	EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
	EntityManager entityManager = eMF.createEntityManager();
	EntityTransaction at = entityManager.getTransaction();

	try
	{
		at.begin();
		AirpodEntity airpodEntity = new AirpodEntity();
		airpodEntity.setId(4);
		airpodEntity.setType("ear");;
		airpodEntity.setWarranty("1.5 year");;
		airpodEntity.setPrice(3699);
		airpodEntity.setRatings(8);
		airpodEntity.setReviws("Good");
		airpodEntity.setName("Boat ");
		airpodEntity.setColors(" red");
		airpodEntity.setConnectivity(" wireless");
		airpodEntity.setSustainable("regular");

		entityManager.persist(airpodEntity);
		at.commit();

	}

	catch(
	Exception e)
	{
		e.printStackTrace();

	}finally
	{
		entityManager.close();
		eMF.close();
	}
}
}


