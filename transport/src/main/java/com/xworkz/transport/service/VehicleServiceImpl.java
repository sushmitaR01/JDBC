package com.xworkz.transport.service;

import com.xworkz.transport.entity.VehicleEntity;
import com.xworkz.transport.repository.VehicleRepo;
import com.xworkz.transport.repository.VehicleRepoImpl;

public class VehicleServiceImpl implements VehicleService {

	@Override
	public boolean save(VehicleEntity vehicleEntity) {
		System.out.println("VehicleEntity" + vehicleEntity.toString());
		VehicleRepo vehicleRepo = new VehicleRepoImpl();
		vehicleRepo.save(vehicleEntity);

		return false;
	}

}
