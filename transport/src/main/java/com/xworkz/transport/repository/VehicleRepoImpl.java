package com.xworkz.transport.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.transport.entity.VehicleEntity;

public class VehicleRepoImpl implements VehicleRepo {

	@Override
	public boolean save(VehicleEntity vehicleEntity) {
	System.out.println("VehicleEntity"+vehicleEntity.toString());
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager entityManager = emf.createEntityManager();
	EntityTransaction et = entityManager.getTransaction();
	try {
		et.begin();
		entityManager.persist(vehicleEntity);
		et.commit();
	}catch (Exception e) {
		e.printStackTrace();
		if(et.isActive()) {
			et.rollback();
		}
	}finally {
		entityManager.close();
		emf.close();
		
	}
		return false;
	}

}
