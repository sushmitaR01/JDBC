package com.xworkz.camera.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.camera.dto.CameraDto;

public class CameraInsertRunner {

	public static void main(String[] args) {
		EntityManagerFactory eMf = Persistence.createEntityManagerFactory("xworkz");
		EntityManager em = eMf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		List<CameraDto> list = new ArrayList<CameraDto>();
		list.add(new CameraDto(1, "DSLR", 5000, "CMOS"));
		list.add(new CameraDto(2, "Go pro", 31990, "CMOS"));
		list.add(new CameraDto(3, "sony", 16000, "full frame sensors"));
		list.add(new CameraDto(4, "Nikon", 5000, "CMOS"));
		list.add(new CameraDto(5, "SLR", 6789, "full frame sensors"));
		list.add(new CameraDto(6, "medium format ", 9086, "CMOS"));
		list.add(new CameraDto(7, "mirrorless", 6789, "full frame sensors"));
		list.add(new CameraDto(8, "action camera", 5000, "CMOS"));
		list.add(new CameraDto(9, "kodak", 10000, "full frame sensors"));
		list.add(new CameraDto(10, "rolleiflex", 50800, "CMOS"));

		

		

		try {
			et.begin();

			for (CameraDto cameraDto : list) {
				em.persist(cameraDto);
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
