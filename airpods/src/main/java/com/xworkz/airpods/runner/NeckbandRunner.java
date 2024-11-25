package com.xworkz.airpods.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.airpods.dto.AirpodEntity;
import com.xworkz.airpods.dto.NeckbandEntity;

public class NeckbandRunner {

	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager entityManager = eMF.createEntityManager();
		EntityTransaction at = entityManager.getTransaction();

		try
		{
			at.begin();
			NeckbandEntity neckbandEntity = new NeckbandEntity();
			neckbandEntity.setId(5);
			neckbandEntity.setType("In ear");;
			neckbandEntity.setWarranty("6 year");;
			neckbandEntity.setPrice(10000);
			neckbandEntity.setRatings(10);
			neckbandEntity.setReviws(" Excellect");
			neckbandEntity.setName("One pluse ");
			neckbandEntity.setColors(" white");
			neckbandEntity.setConnectivity(" true wireless");;
			neckbandEntity.setSustainable("regular");;

			entityManager.merge(neckbandEntity);
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


