package com.xworkz.airport.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.airport.entity.AirportEntity;

public class InsertRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<AirportEntity> dtos = new ArrayList<>();
		

		dtos.add(new AirportEntity("Sushmita", 9877655445L, 23, (short) 34, true, "Banglore", "Hydrabad", 'F',
				"RR nagar"));
		dtos.add(new AirportEntity("Vijayalaxmi", 9898776655L, 27, (short) 14, false, "hubli", "jaipur", 'F',
				"mahalaxmi layout "));
		dtos.add(new AirportEntity("sapnaz", 9887654567L, 13, (short) 24, true, "belgavi", "maharastra", 'F',
				"basham circle"));
		dtos.add(new AirportEntity("poornima", 8648764578L, 33, (short) 15, false, "chennai", "andhara", 'F',
				"pennaya"));
		dtos.add(new AirportEntity("Laxmi", 9877654387L, 53, (short) 13, true, "kolkata", "tamilnadu", 'F',
				"nandini layout"));
		dtos.add(new AirportEntity("Samanvi", 98776554456L, 23, (short) 16, false, "mangalore", "kerala", 'F',
				"vijaya nagar"));
		dtos.add(new AirportEntity("naveen", 98766543234L, 43, (short) 19, true, "karwar", "hospet", 'M', "J P nagar"));
		dtos.add(new AirportEntity("Kiran", 987987654456L, 63, (short) 40, false, "manipal", "tailand", 'M',
				"RM nagar"));
		dtos.add(new AirportEntity("Vrushank", 9898765456L, 56, (short) 20, true, "goa", "dubai", 'M',
				"keshwapur nagar"));
		dtos.add(new AirportEntity("Shamitha", 986543256L, 39, (short) 24, false, "delhi", "kashmir", 'F', "KR nagar"));

		
		
		
		try {
			et.begin();
			for (AirportEntity airportEntity : dtos) {
				em.merge(airportEntity);

			}
			et.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}
	}

}
