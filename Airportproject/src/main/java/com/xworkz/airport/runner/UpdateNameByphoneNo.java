package com.xworkz.airport.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.airport.entity.AirportEntity;

public class UpdateNameByphoneNo {

	public static void main(String[] args) {
		EntityManagerFactory eMF = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eM = eMF.createEntityManager();
		EntityTransaction eT = eM.getTransaction();
		try {
			eT.begin(); // Assuming updateNameByphoneNo is an update query 
		Query query = eM.createNamedQuery("updateNameByphoneNo"); 
		query.setParameter("name", "Deepa"); 
		query.setParameter("phoneNo", 9877655445L); 
		int rowsUpdated = query.executeUpdate();
		eT.commit(); 
		System.out.println("Number of records updated: " + rowsUpdated); 
		} catch (Exception e) 
		{ 
			if (eT.isActive()) 
			{ 
				System.out.println("Rolling back transaction..."); 
				eT.rollback();
				System.out.println("Transaction rolled back due to error."); 
				} 
			e.printStackTrace();
		} finally {
			eM.close();
			eMF.close();
		}

	}

}
