package com.fleetmanagement.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.fleetmanagement.entity.Reading;

public interface ReadingRepository extends CrudRepository<Reading, String> {


}
