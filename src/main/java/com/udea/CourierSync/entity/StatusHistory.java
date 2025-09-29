package com.udea.CourierSync.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.udea.CourierSync.enums.ShipmentStatus;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class StatusHistory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "shipment_id", nullable = false)
  private Shipment shipment;

  @Enumerated(EnumType.STRING)
  @Column(name = "old_status", nullable = false)
  private ShipmentStatus oldStatus;

  @Enumerated(EnumType.STRING)
  @Column(name = "new_status", nullable = false)
  private ShipmentStatus newStatus;

  public StatusHistory() {
  }

  @JsonCreator
  public StatusHistory(@JsonProperty("id") Long id,
      @JsonProperty("shipment") Shipment shipment,
      @JsonProperty("oldStatus") ShipmentStatus oldStatus,
      @JsonProperty("newStatus") ShipmentStatus newStatus) {
    this.id = id;
    this.shipment = shipment;
    this.oldStatus = oldStatus;
    this.newStatus = newStatus;
  }
}
