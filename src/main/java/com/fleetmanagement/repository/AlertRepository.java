package com.fleetmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.fleetmanagement.entity.Alert;

public interface AlertRepository extends CrudRepository<Alert, String> {

}
