package com.fleetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fleetmanagement.entity.Vehicle;
import com.fleetmanagement.service.VehicleService;

@CrossOrigin(origins = "http://mocker.egen.academy")
@RestController
public class VehicleController {

	@Autowired
	VehicleService vehicleService;
	
	@PutMapping("vehicles")
	public void createVehicles(@RequestBody List<Vehicle> vehicles) {
		vehicleService.create(vehicles);
	}
	
	@GetMapping("vehicles")
	public List<Vehicle> findVehicles(){
		return vehicleService.get();
	}
}
