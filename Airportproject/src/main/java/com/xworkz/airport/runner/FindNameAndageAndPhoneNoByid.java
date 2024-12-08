package com.xworkz.airport.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindNameAndageAndPhoneNoByid {
	static String str = null;

	public static void main(String[] args) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		
		try {
			eTrans.begin();
			Query query = eManager.createNamedQuery("findNameAndageAndphoneNoByid");
			query.setParameter("id", 1);
			List<Object[]> objAry = query.getResultList();

			for (Object[] object : objAry) {
				String str = (String) object[0];
				System.out.println("name==" + str);
				System.out.println("age==" + object[1]);
				System.out.println("phoneNo==" + object[2]);

			}

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
