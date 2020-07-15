package com.fleetmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import com.fleetmanagement.entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, String> {

}
