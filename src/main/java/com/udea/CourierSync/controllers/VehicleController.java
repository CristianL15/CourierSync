package com.udea.CourierSync.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.udea.CourierSync.services.VehicleService;
import com.udea.CourierSync.DTO.VehicleDTO;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

  @Autowired
  private VehicleService vehicleService;

  @CrossOrigin
  @PostMapping
  public ResponseEntity<VehicleDTO> create(@RequestBody VehicleDTO dto) {
    VehicleDTO created = vehicleService.createVehicle(dto);
    return ResponseEntity.status(HttpStatus.CREATED).body(created);
  }

  @GetMapping
  public List<VehicleDTO> list() {
    return vehicleService.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<VehicleDTO> get(@PathVariable Long id) {
    return vehicleService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

  @CrossOrigin
  @PutMapping("/{id}")
  public ResponseEntity<VehicleDTO> update(@PathVariable Long id, @RequestBody VehicleDTO dto) {
    VehicleDTO updated = vehicleService.update(id, dto);
    return ResponseEntity.ok(updated);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    vehicleService.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}
