package com.xworkz.transport.runner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.xworkz.transport.entity.VehicleEntity;
import com.xworkz.transport.service.VehicleService;
import com.xworkz.transport.service.VehicleServiceImpl;

public class MainRunner {

	public static void main(String[] args) {
		LocalDate customDate8 = LocalDate.parse("19-01-2023", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		VehicleEntity vehicleEntity = (new VehicleEntity(10, " Model S", "Tesla model", 1987654890L, 22.5f, 100.0, true,
				'E', customDate8, 5));
		
		VehicleService vehicleService=new VehicleServiceImpl();
		vehicleService.save(vehicleEntity);

	}

}
