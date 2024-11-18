package com.xworkz.train.service;

import com.xworkz.train.dto.TrainDto;
import com.xworkz.train.repo.TrainRepoImpl;

public class TrainserviceImpl implements TrainService{

	public boolean save(TrainDto dto) {
		boolean isValid=true;
		System.out.println("name:"+dto.getName());
		System.out.println("age:" +dto.getAge());
		System.out.println("phone:"+dto.getPhone());
		System.out.println("address:"+dto.getAddress());
		System.out.println("email:"+dto.getEmail());
		if(isValid) {
			TrainRepoImpl repo= new TrainRepoImpl();
		boolean ref=repo.save(dto);
		}
		return false;
	}

}
