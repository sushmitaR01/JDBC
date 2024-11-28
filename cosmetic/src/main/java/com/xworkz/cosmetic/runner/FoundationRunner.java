package com.xworkz.cosmetic.runner;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.cosmetic.dto.FoundationDto;

public class FoundationRunner {

	public static void main(String[] args) {
		EntityManagerFactory emFactory =Persistence.createEntityManagerFactory("xworkz");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		List<FoundationDto> list= new ArrayList<>();
		list.add(new FoundationDto("Lakme",212,2000,"Sticky","Medium Coverage","Natural","Dermatologically","Fair to light",2));
        list.add(new FoundationDto("Sugar",213,9000,"Liquid","high Coverage","Luminous","Cruity free","Fair to light",3));
        list.add(new FoundationDto("Malino",242,8000,"Sticky","low Coverage","Natural","Dermatologically","Fair to light",1));
        list.add(new FoundationDto("Elle18",292,2000,"Liquid","Medium Coverage","Luminous","Cruity free","Fair to light",2));
        list.add(new FoundationDto("face canada",212,4000,"Sticky","low Coverage","Natural","Dermatologically","Fair to light",2));
        list.add(new FoundationDto("Ronzille",202,3000,"Liquid","high Coverage","Luminous","Cruity free","Fair to light",4));
        list.add(new FoundationDto("seven seas",222,2000,"Sticky","Medium Coverage","Natural","Dermatologically","Fair to light",3));
        list.add(new FoundationDto("mila beauty",232,1000,"Liquid","low Coverage","Luminous","Dermatologically","Fair to light",2));
        list.add(new FoundationDto("Swiss beauty",242,1000,"Sticky","high Coverage","Natural","Cruity free","Fair to light",1));
        list.add(new FoundationDto("Hilary Rhoda",252,2000,"Liquid","Medium Coverage","Luminous","Dermatologically","Fair to light",2));
        
        for (FoundationDto foundationDto : list) {
        	FoundationDto dto= new FoundationDto();
            dto.setProductName(foundationDto.getProductName());
            dto.setShadeNo(foundationDto.getShadeNo());
            dto.setPrice(foundationDto.getPrice());
            dto.setType(foundationDto.getType());
            dto.setCoverage(foundationDto.getCoverage());
            dto.setFinish(foundationDto.getFinish());
            dto.setPreference(foundationDto.getPreference());
            dto.setSkinTone(foundationDto.getSkinTone());
            dto.setWarranty(foundationDto.getWarranty());
            
        }

		
		try {
			
			eTrans.begin();
			for(FoundationDto foundationDto: list) {
				eManager.persist(foundationDto);
			}
			eTrans.commit();
			
		} catch (Exception e) {
			
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
			e.printStackTrace();
		}finally {
			
			eManager.close();
			emFactory.close();
			
		}
	}
	
	}


