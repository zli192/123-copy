package com.fleetmanagement.service;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fleetmanagement.entity.Alert;
import com.fleetmanagement.entity.Reading;
import com.fleetmanagement.entity.Vehicle;
import com.fleetmanagement.repository.AlertRepository;

@Service
public class AlertServiceImpl implements AlertService {

	@Autowired
	AlertRepository alertRepository;
	
	@Autowired
	VehicleService vehicleService;
	
	public void createAlert(String vin, String rule, String priority) {
		
		LocalDateTime timestamp = LocalDateTime.now(); 
		Alert alert = new Alert();
		alert.setPriority(priority);
		alert.setRule(rule);
		alert.setVin(vin);
		System.out.println(timestamp);
		alert.setTimestamp(timestamp);
		alertRepository.save(alert);
	}

	@Override
	public void setAlertFromRule(Reading reading) {
		
		Vehicle vehicle = vehicleService.getVehicleDetails(reading.getVin());
		double frontLeft = reading.getTires().getFrontLeft();
		double frontRight = reading.getTires().getFrontRight();
		double rearLeft = reading.getTires().getRearLeft();
		double rearRight = reading.getTires().getRearRight();
		
		if(reading != null) {
			if(reading.getEngineRpm() > vehicle.getRedLineRpm()) {
				createAlert(reading.getVin(), "engineRpm > readlineRpm", "HIGH");
			}
			if(reading.getFuelVoulme() < (0.1*vehicle.getMaxFuelVolume())) {
				createAlert(reading.getVin(), "fuelVolume < 10% of maxFuelVolume", "MEDIUM");
			}
			if(frontLeft < 32 || frontLeft > 36) {
				createAlert(reading.getVin(), "The tire pressure is "+frontLeft+"psi", "LOW");
			}
			if(frontRight < 32 || frontRight > 36) {
				createAlert(reading.getVin(), "The tire pressure is "+frontRight+"psi", "LOW");
			}
			if(rearLeft < 32 || rearLeft > 36) {
				createAlert(reading.getVin(), "The tire pressure is "+rearLeft+"psi", "LOW");
			}
			if(rearRight < 32 || rearRight > 36) {
				createAlert(reading.getVin(), "The tire pressure is "+rearRight+"psi", "LOW");
			}
			if(reading.isEngineCoolantLow()) {
				createAlert(reading.getVin(), "Engine coolant is low", "LOW");
			}
			if(reading.isCheckEngineLightOn()) {
				createAlert(reading.getVin(), "Engine light is low", "LOW");
			}
		}
	}

	@Override
	public List<Alert> get() {
		return (List<Alert>) alertRepository.findAll();
	}

}

/**
 * Set of rules:
 *  a. Rule : engineRpm > readlineRpm, Priority : HIGH 
	b. Rule : fuelVolume < 10% of maxFuelVolume, Priority : MEDIUM 
	c. Rule : tire pressure of any tire < 32psi or > 36psi , Priority : LOW 
	d. Rule: engineCoolantLow is true or checkEngineLightOn is true, Priority : LOW 
 **/
