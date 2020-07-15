package com.fleetmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fleetmanagement.entity.Vehicle;
import com.fleetmanagement.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;
	
	@Override
	public void create(List<Vehicle> vehicles) {
			
		vehicleRepository.saveAll(vehicles);
	}

	@Override
	public List<Vehicle> get() {
		return (List<Vehicle>) vehicleRepository.findAll();
	}

	@Override
	public Vehicle getVehicleDetails(String vin) {

		Optional<Vehicle> existing = vehicleRepository.findById(vin);
		if(!existing.isPresent()) {
			return null;
		}
        return existing.get(); 	
	}

}
