package com.xworkz.transport.runner;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllTypesRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		Query query1 = entityManager.createNamedQuery("findModelNameByIdAndManufacturer");
		query1.setParameter("byId", 1).setParameter("byManufacturer", "Tesla");
		String modelName = (String) query1.getSingleResult();
		System.out.println("Query1: " + modelName);

		Query query2 = entityManager.createNamedQuery("findMileageByIdAndModelName");
		query2.setParameter("byId", 2).setParameter("byModelName", "Honda Accord");
		Float mileage = (Float) query2.getSingleResult();
		System.out.println("Query2: " + mileage);

		Query query3 = entityManager.createNamedQuery("findEngineCapacityByIdAndModelName");
		query3.setParameter("byId", 3).setParameter("byModelName", "BMW i8");
		Double engineCapacity = (Double) query3.getSingleResult();
		System.out.println("Query3: " + engineCapacity);

		Query query4=entityManager.createNamedQuery("findFuelTypeByIdAndModelName");
		query4.setParameter("byId",4).setParameter("byModelName", "Audi Q7");
		Character fuelType=(Character)query4.getSingleResult();
		System.out.println("Query4: "+ fuelType);
//		
		Query query5 = entityManager.createNamedQuery("findDateIdAndModelName");
		query5.setParameter("byId", 5).setParameter("byModelName", "Mercedes-Benz GLC");
		LocalDate date = (LocalDate) query5.getSingleResult();
		System.out.println("Query5: " + date);
//		
		Query query6 = entityManager.createNamedQuery("findSeatingIdAndModelName");
		query6.setParameter("byId", 6).setParameter("byModelName", "Porsche Taycan");
		Integer seatingCapacity = (Integer) query6.getSingleResult();
		System.out.println("Query6: " + seatingCapacity);

		Query query7 = entityManager.createNamedQuery("findIsElectricByIdAndModelName");
		query7.setParameter("byId", 1).setParameter("byModelName", "Tesla Model S");
		Boolean isElectric = (Boolean) query7.getSingleResult();
		System.out.println("Query7: " + isElectric);

		try {
			et.begin();
			et.commit();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			emf.close();
			entityManager.close();
		}

	}

}
