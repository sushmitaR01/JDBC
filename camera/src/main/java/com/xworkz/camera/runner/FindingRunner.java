package com.xworkz.camera.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.camera.dto.CameraDto;

public class FindingRunner {

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();
		Query query = eManager.createNamedQuery("findByid");
		Object obj = query.getSingleResult();

		CameraDto entity = (CameraDto) obj;
		System.out.println("Value : " + entity.toString());
		System.out.println("======================");

		Query query2 = eManager.createNamedQuery("findBybrand");
		Object obj2 = query2.getSingleResult();

		CameraDto entity2 = (CameraDto) obj2;
		System.out.println("Value : " + entity2.toString());
		System.out.println("======================");
		Query query3 = eManager.createNamedQuery("findByprice");
		Object obj3 = query3.getSingleResult();

		CameraDto entity3 = (CameraDto) obj3;
		System.out.println("Value : " + entity3.toString());
		System.out.println("======================");

		Query query4 = eManager.createNamedQuery("findsensortype");
		Object obj4 = query4.getSingleResult();

		CameraDto entity4 = (CameraDto) obj4;
		System.out.println("Value : " + entity4.toString());
		System.out.println("======================");
		
		Query query5=eManager.createNamedQuery("findByid&Brand");
		Object obj5=query5.getResultList();
		
		List<CameraDto> res2=query5.getResultList();
		
		for(CameraDto dto2 : res2) {
			System.out.println("Values :"+ dto2.getId() + " , "+ dto2.getBrand());
			System.out.println("==========================");


		try {
			eTrans.begin();
			eTrans.commit();

		} catch (Exception e) {
			if (eTrans.isActive()) {
				eTrans.rollback();
			}
		} finally {
			eManager.close();
			emFactory.close();
		}
	}

	}
}
