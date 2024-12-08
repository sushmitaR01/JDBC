package com.xworkz.airport.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.airport.entity.AirportEntity;

public class FindAllByAddressAndPhoneNo {

	public static void main(String[] args) {
		{
	        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
	        EntityManager eManager = emFactory.createEntityManager();
	        EntityTransaction eTrans = eManager.getTransaction();

	        try {
	            eTrans.begin();

	            Query query = eManager.createNamedQuery("findAllByAddressAndPhoneNo");
	            query.setParameter("address", "J P nagar");
	            query.setParameter("phoneNo", 986543256L);

	            List<AirportEntity> results = query.getResultList();
	            for (AirportEntity airportEntity : results) {
	            	System.out.println("Id: " + airportEntity.getId());
	                System.out.println("Name: " + airportEntity.getName());
	                System.out.println("Age: " + airportEntity.getAge());
	                System.out.println("Ratings: " + airportEntity.getRating());
	                System.out.println("Source: " + airportEntity.getSource());
	                System.out.println("Destination: " + airportEntity.getDestination());
	                
	            }

	            eTrans.commit();
	            System.out.println("Query executed successfully.");
	        } catch (Exception e) {
	            if (eTrans.isActive()) {
	                System.out.println("Rolling back transaction...");
	                eTrans.rollback();
	                System.out.println("Transaction rolled back due to error.");
	            }
	            e.printStackTrace();
	        } finally {
	            eManager.close();
	            emFactory.close();
	        }
	    }
	}
}
