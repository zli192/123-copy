package com.fleetmanagement.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.fleetmanagement.entity.Reading;
import com.fleetmanagement.service.ReadingService;

//@CrossOrigin(origins = "http://mocker.egen.academy")
@RestController
public class ReadingController {

	@Autowired
	ReadingService readingService;
	
	@GetMapping("readings")
	public List<Reading> findReadings(){	
		return readingService.get();
	}
	
	@PostMapping("readings")
	public void createReadings(@RequestBody Reading reading) {
		readingService.create(reading);
	}
}
