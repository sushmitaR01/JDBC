package com.xworkz.student.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.student.dto.StudentDto;



public class StudentInsertRunner {

	public static void main(String[] args) {
		EntityManagerFactory eMf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = eMf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<StudentDto> list = new ArrayList<StudentDto>();
		list.add(new StudentDto(1, "John Doe", "123 Maple Street", 9876521089L, 30, "john.@example.com"));
		list.add(new StudentDto(2, "Niriksha", "KR Street", 98654567899L, 23, "Niriksha.@example.com"));
		list.add(new StudentDto(3, "Revati", "Navarang", 865348976L, 20, "Revati.@example.com"));
		list.add(new StudentDto(4, "Gunashree", "KR puram", 98765210876L, 19, "Gunashree.@example.com"));
		list.add(new StudentDto(5, "Divya", "Mahalaxmi layout", 7447876546L, 33, "john.@example.com"));
		list.add(new StudentDto(6, "Megha", "Pennya", 98765976210L, 25, "Divya.@example.com"));
		list.add(new StudentDto(7, "Poornima", "J P nagar", 7654765210L, 22, "Poornima.@example.com"));
		list.add(new StudentDto(8, "Laxmi", "Basham circle", 987699210L, 30, "Laxmi.@example.com"));
		list.add(new StudentDto(9, "bhagya", "NM nagar", 98765298710L, 18, "bhagya.@example.com"));
		list.add(new StudentDto(10, " Doe", " M P Street", 98765987210L, 30, "Doe.@example.com"));

		

		

		try {
			et.begin();

			for (StudentDto studentDto : list) {
				em.persist(studentDto);
			}
			et.commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			eMf.close();
		}

	}


	}


