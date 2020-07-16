package com.fleetmanagement.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fleetmanagement.entity.Reading;
import com.fleetmanagement.repository.ReadingRepository;

@Service
public class ReadingServiceImpl implements ReadingService {

	@Autowired
	ReadingRepository readingRepository;
	
	@Override
	public void create(Reading reading) {
		readingRepository.save(reading);
	}

	@Override
	public List<Reading> get() {
		return (List<Reading>) readingRepository.findAll();
	}	
}
