package com.udea.CourierSync.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.CourierSync.repository.ShipmentRepository;
import com.udea.CourierSync.repository.ClientRepository;
import com.udea.CourierSync.repository.UserRepository;

import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

  @Autowired
  private ShipmentRepository shipmentRepository;

  @Autowired
  private ClientRepository clientRepository;

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/metrics")
  public Map<String, Object> metrics() {
    long shipments = shipmentRepository.count();
    long clients = clientRepository.count();
    long users = userRepository.count();

    return Map.of(
        "shipments", shipments,
        "clients", clients,
        "users", users);
  }
}
