package com.company;

public abstract class Vehicle {
    private VehicleFactory.VehicleType type;
    private String manufacturer;


    public void setType(VehicleFactory.VehicleType type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public VehicleFactory.VehicleType getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
