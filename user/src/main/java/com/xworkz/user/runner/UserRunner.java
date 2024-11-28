package com.xworkz.user.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.user.dto.UserDto;

public class UserRunner {

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();

	        List<UserDto> dtos = new ArrayList<>();

	        dtos.add(new UserDto("sushmita", "sushmita@gmail.com", "sushmita@123", "7795876788", "Dharwad", 25));
	        dtos.add(new UserDto("samanvi", "samanvi@gmail.com", "samanvi@123", "8088563251", "Bagalkot", 28));
	        dtos.add(new UserDto("naveen", "naveen@gmail.com", "naveen@123", "7798654321", "Hubballi", 22));
	        dtos.add(new UserDto("niveditha", "niveditha@gmail.com", "niveditha@123", "9908765434", "Haveri", 30));
	        dtos.add(new UserDto("vrushanak", "vrushanak@gmail.com", "vrushanak@123", "8088963214", "Gadag", 27));
	        dtos.add(new UserDto("Sindhu", "sindhu@gmail.com", "sindhu@123", "9456337821", "Karwar", 24));
	        dtos.add(new UserDto("kiran", "kiran@gmail.com", "kiran@123", "9902454621", "Davangere", 26));
	        dtos.add(new UserDto("karuna", "karuna@gmail.com", "karuna@123", "7795672341", "Mandya", 29));
	        dtos.add(new UserDto("Varsha", "varsha@gmail.com", "varsha@123", "6360218686", "Shimoga", 23));
	        dtos.add(new UserDto("Amrutha", "amrutha@gmail.com", "amrutha@123", "9906787432", "Tumkur", 31));

	        try {
	            et.begin();
	           
			
	            for (UserDto userdto : dtos) {
	               em.persist(userdto);
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


