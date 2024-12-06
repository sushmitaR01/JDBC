package com.xworkz.organization.runner;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.xworkz.organization.entity.OrganizationEntity;
import com.mysql.cj.Query;

public class FindAllRunner {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		// Getting a All Data
		Query query = (Query) eManager.createNamedQuery("findAll");
		List<OrganizationEntity> list = query.getResultList();;
		list.forEach(ref -> System.out.println(ref));

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


