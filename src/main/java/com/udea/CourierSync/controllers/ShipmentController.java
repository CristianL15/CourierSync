package com.udea.CourierSync.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.udea.CourierSync.services.ShipmentService;
import com.udea.CourierSync.DTO.ShipmentDTO;

import java.util.List;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

  @Autowired
  private ShipmentService shipmentService;

  @CrossOrigin
  @PostMapping
  public ResponseEntity<ShipmentDTO> create(@RequestBody ShipmentDTO dto) {
    ShipmentDTO created = shipmentService.createShipment(dto);
    return ResponseEntity.status(HttpStatus.CREATED).body(created);
  }

  @GetMapping
  public List<ShipmentDTO> list() {
    return shipmentService.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<ShipmentDTO> get(@PathVariable Long id) {
    return shipmentService.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }

  @PutMapping("/{id}")
  public ResponseEntity<ShipmentDTO> update(@PathVariable Long id, @RequestBody ShipmentDTO dto) {
    ShipmentDTO updated = shipmentService.update(id, dto);
    return ResponseEntity.ok(updated);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    shipmentService.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}
