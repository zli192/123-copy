package com.fleetmanagement.service;

import java.util.List;
import java.util.Optional;

import com.fleetmanagement.entity.Vehicle;

public interface VehicleService {

	void create(List<Vehicle> vehicles);
	List<Vehicle> get();
	Vehicle getVehicleDetails(String vin);
}
