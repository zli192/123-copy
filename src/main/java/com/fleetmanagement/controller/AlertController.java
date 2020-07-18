package com.fleetmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fleetmanagement.entity.Alert;
import com.fleetmanagement.service.AlertService;

@RestController
public class AlertController {
	
	@Autowired
	AlertService alertService;
	
	@GetMapping("alerts")
	public List<Alert> getAlerts(){
		return alertService.get();
	}
}
