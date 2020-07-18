package com.fleetmanagement.service;

import java.util.List;

import com.fleetmanagement.entity.Alert;
import com.fleetmanagement.entity.Reading;

public interface AlertService {
	
	public void createAlert(String vin, String rule, String priority);
	public void setAlertFromRule(Reading reading);
	public List<Alert> get();
}
