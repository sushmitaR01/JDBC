package com.xworkz.cosmetic.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cosmetic.dto.FoundationDto;
import com.xworkz.cosmetic.dto.PerfumDto;

public class PerfumeRunner {

	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction eTrans = eManager.getTransaction();

		List<PerfumDto> list = new ArrayList<>();
		list.add(new PerfumDto("calvin klein", "100ml", 2000, "Eau de toilrtte", "Medium", "Cardamom",
				"Ck One Eau De Toilrtte", 6, 4));
		list.add(new PerfumDto("Skinn", "150ml", 4000, "classics", "Strong", "Bergamot", "daily fragnance", 8, 3));
		list.add(new PerfumDto(" jaguar", "150ml", 2244, "classic black", "Medium", "night time fragance",
				"Jaguar classic black", 4, 8));
		list.add(new PerfumDto("natica klein", "100ml", 2890, "Eau de toilrtte", "Medium", "Cardamom",
				"Ck One Eau De Toilrtte", 2, 7));
		list.add(new PerfumDto("davidoff ", "110ml", 2256, "Eau de toilrtte", "Medium", "Cardamom",
				"Ck One Eau De Toilrtte", 6, 0));
		list.add(new PerfumDto(" tommy hilfiger", "150ml", 2000, "Eau de toilrtte", "Medium", "Cardamom",
				"Ck One Eau De Toilrtte", 5, 6));
		list.add(new PerfumDto(" lancome", "100ml", 3000, "Eau de toilrtte", "Medium", "Cardamom",
				"Ck One Eau De Toilrtte", 6, 4));
		list.add(new PerfumDto(" Estee lauder", "120ml", 1000, "Eau de toilrtte", "Medium", "Cardamom",
				"Ck One Eau De Toilrtte", 6, 4));
		list.add(new PerfumDto(" Guess", "100ml", 4000, "Eau de toilrtte", "Medium", "Cardamom",
				"Ck One Eau De Toilrtte", 9, 4));
		list.add(new PerfumDto("carolina herrera", "300ml", 1000, "Eau de toilrtte", "Medium", "Cardamom",
				"Ck One Eau De Toilrtte", 6, 6));

		for (PerfumDto perfumDto : list) {
			PerfumDto dto = new PerfumDto();
			dto.setProductName(perfumDto.getProductName());
			dto.setSize(perfumDto.getSize());
			dto.setPrice(perfumDto.getPrice());
			dto.setType(perfumDto.getType());
			dto.setStrength(perfumDto.getStrength());
			dto.setTopNote(perfumDto.getTopNote());
			dto.setProductDetail(perfumDto.getProductDetail());
			dto.setRating(perfumDto.getRating());
			dto.setWarranty(perfumDto.getWarranty());

		}

		try {

			eTrans.begin();
			for (PerfumDto perfumDto : list) {
				eManager.persist(perfumDto);
			}
			eTrans.commit();

		} catch (Exception e) {

			if (eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		} finally {

			eManager.close();
			emFactory.close();

		}
	}

}
