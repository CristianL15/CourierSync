package com.udea.CourierSync.repository;

import com.udea.CourierSync.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
  java.util.Optional<Vehicle> findByPlate(String plate);
}