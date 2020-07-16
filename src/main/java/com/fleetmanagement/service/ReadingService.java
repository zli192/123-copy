package com.fleetmanagement.service;

import java.util.List;
import java.util.Map;

import com.fleetmanagement.entity.Reading;

public interface ReadingService {

	void create(Reading reading);
	List<Reading> get();
}
