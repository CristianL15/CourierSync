package com.udea.CourierSync.DTO;

public class PackageDTO {
    private Long id;
    private String description;
    private Double weight;
    private Double volume;

    public PackageDTO() {
    }

    public PackageDTO(Long id, String description, Double weight, Double volume) {
        this.id = id;
        this.description = description;
        this.weight = weight;
        this.volume = volume;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}