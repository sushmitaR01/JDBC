package com.xworkz.organization.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.organization.entity.OrganizationEntity;

public class InsertRunner {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		List<OrganizationEntity> list = new ArrayList<OrganizationEntity>();
		list.add(new OrganizationEntity(202226, 01, "Priya", "priya26@gmail.com", "Biology", 9781234567L, 24000));
		list.add(new OrganizationEntity(218997, 012, "shreya", "shreya@gmail.com", "Commerce", 9781234567L, 24000));
		list.add(new OrganizationEntity(902226, 03, "poornima", "poornima@gmail.com", "computer", 9781234567L, 24000));
		list.add(new OrganizationEntity(2098656, 04, "laxmi", "laxmi@gmail.com", "maths", 9781234567L, 24000));
		list.add(new OrganizationEntity(107726, 05, "karuna", "karuna@gmail.com", "stats", 9781234567L, 24000));
		list.add(new OrganizationEntity(602226, 06, "kruthi", "kruthi@gmail.com", "physics", 9781234567L, 24000));
		list.add(new OrganizationEntity(902826, 07, "pallavi", "pallavi@gmail.com", "history", 9781234567L, 24000));
		list.add(new OrganizationEntity(602526, 02, "prutvi", "prutvi@gmail.com", "zoology", 9781234567L, 24000));
		list.add(new OrganizationEntity(302226, 03, "janani", "janani@gmail.com", "botony", 9781234567L, 24000));
		list.add(new OrganizationEntity(902226, 001, "asha", "asha@gmail.com", "zeology", 9781234567L, 24000));

		for (OrganizationEntity entity : list) {

			eManager.persist(entity);
		}

		try {

			eTrans.begin();
			eTrans.commit();

		} catch (Exception e) {

			if (eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		} finally {
			emFactory.close();
			eManager.close();
		}

	}

}
