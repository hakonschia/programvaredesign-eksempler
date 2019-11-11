package com.company;

public abstract class Vehicle {
    protected String type;
    protected String manufacturer;


    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
