package com.xworkz.transport.runner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.transport.entity.VehicleEntity;

public class VehicleRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
		if (emf != null) {
			System.out.println("connected");
		} else {
			System.out.println("not connected");
		}
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {

			et.begin();
			LocalDate customDate1 = LocalDate.parse("10-09-2021", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate customDate2 = LocalDate.parse("22-07-2023", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate customDate3 = LocalDate.parse("15-03-2023", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate customDate4 = LocalDate.parse("30-08-2022", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate customDate5 = LocalDate.parse("05-06-2024", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate customDate6 = LocalDate.parse("12-01-2023", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			LocalDate customDate7 = LocalDate.parse("12-02-2023", DateTimeFormatter.ofPattern("dd-MM-yyyy"));

			List<VehicleEntity> list = new ArrayList<>();
			list.add(new VehicleEntity(1, "Tesla Model S", "Tesla", 1234567890L, 22.5f, 100.0, true, 'E', customDate1,
					5));
			list.add(new VehicleEntity(2, "Honda Accord", "Honda", 1234567891L, 20.0f, 2500.0, false, 'P', customDate2,
					5));
			list.add(new VehicleEntity(3, "BMW i8", "BMW", 1234567892L, 18.5f, 1500.0, true, 'E', customDate3, 4));
			list.add(new VehicleEntity(4, "Audi Q7", "Audi", 1234567893L, 14.5f, 3000.0, false, 'P', customDate4, 7));
			list.add(new VehicleEntity(5, "Mercedes-Benz GLC", "Mercedes-Benz", 1234567894L, 16.0f, 2000.0, false, 'P',
					customDate5, 5));
			list.add(new VehicleEntity(6, "Porsche Taycan", "Porsche", 1234567895L, 20.0f, 930.0, true, 'E',
					customDate6, 4));
			list.add(new VehicleEntity(7, "Honda Jazz", "Honda", 1234567896L, 20.0f, 2500.0, false, 'P', customDate7,
					5));
			for (VehicleEntity vt : list)
				entityManager.persist(vt);

			et.commit();

		} catch (Exception e) {
			e.getMessage();
		} finally {
			emf.close();
			entityManager.close();
		}

	}

}
