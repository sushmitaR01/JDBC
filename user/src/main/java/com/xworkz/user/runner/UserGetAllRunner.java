package com.xworkz.user.runner;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.user.dto.UserDto;

public class UserGetAllRunner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<UserDto> dtos = em.createQuery("select l from UserDto l", UserDto.class).getResultList();
		for (UserDto  userDto: dtos) {
			System.out.println("login list ===" + userDto.getId() + "===" + userDto.getName() + "==="
					+ userDto.getEmail() + "===" + userDto.getPassword() + "===" + userDto.getAddress() + "==="
					+ userDto.getPhoneNumber()+"==="+userDto.getAge());

		}

		try {
			et.begin();

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


