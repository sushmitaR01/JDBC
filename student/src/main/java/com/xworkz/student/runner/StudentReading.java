package com.xworkz.student.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.student.dto.StudentDto;

public class StudentReading {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		Query query = eManager.createNamedQuery("findByid");
		Object obj = query.getSingleResult();

		StudentDto entity = (StudentDto) obj;
		System.out.println("Value : " + entity.toString());
		System.out.println("======================");

		Query query2 = eManager.createNamedQuery("findByname");
		Object obj2 = query2.getSingleResult();

		StudentDto entity2 = (StudentDto) obj2;
		System.out.println("Value : " + entity2.toString());
		System.out.println("======================");
		Query query3 = eManager.createNamedQuery("findByaddress");
		Object obj3 = query3.getSingleResult();

		StudentDto entity3 = (StudentDto) obj3;
		System.out.println("Value : " + entity3.toString());
		System.out.println("======================");
		Query query4 = eManager.createNamedQuery("findage");
		Object obj4 = query4.getSingleResult();

		StudentDto entity4 = (StudentDto) obj4;
		System.out.println("Value : " + entity4.toString());
		System.out.println("======================");
		Query query5 = eManager.createNamedQuery("findByemail");
		Object obj5 = query5.getSingleResult();

		StudentDto entity5 = (StudentDto) obj5;
		System.out.println("Value : " + entity5.toString());
		System.out.println("======================");

	}

}
