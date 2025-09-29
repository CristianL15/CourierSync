package com.udea.CourierSync.DTO;

import com.udea.CourierSync.enums.ShipmentPriority;
import com.udea.CourierSync.enums.ShipmentStatus;

public class ShipmentDTO {
    private Long id;
    private String trackingCode;
    private ClientDTO client;
    private PackageDTO packageObj;
    private VehicleDTO vehicle;
    private String originAddress;
    private String destinationAddress;
    private ShipmentPriority priority;
    private ShipmentStatus status;

    public ShipmentDTO() {
    }

    public ShipmentDTO(Long id, String trackingCode, ClientDTO client, PackageDTO packageObj, VehicleDTO vehicle,
            String originAddress, String destinationAddress, ShipmentPriority priority, ShipmentStatus status) {
        this.id = id;
        this.trackingCode = trackingCode;
        this.client = client;
        this.packageObj = packageObj;
        this.vehicle = vehicle;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.priority = priority;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public ClientDTO getClient() {
        return client;
    }

    public void setClient(ClientDTO client) {
        this.client = client;
    }

    public PackageDTO getPackage() {
        return packageObj;
    }

    public void setPackage(PackageDTO packageObj) {
        this.packageObj = packageObj;
    }

    public VehicleDTO getVehicle() {
        return vehicle;
    }

    public void setVehicle(VehicleDTO vehicle) {
        this.vehicle = vehicle;
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(String originAddress) {
        this.originAddress = originAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public ShipmentPriority getPriority() {
        return priority;
    }

    public void setPriority(ShipmentPriority priority) {
        this.priority = priority;
    }

    public ShipmentStatus getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatus status) {
        this.status = status;
    }
}