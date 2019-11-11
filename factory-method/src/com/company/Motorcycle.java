package com.company;

public class Motorcycle extends Vehicle {
    private int horsePower;

    public Motorcycle() {
        super.setType("Motorcycle");
        super.setManufacturer("Ducati");

        this.horsePower = 115;
    }

    @Override
    public String toString() {
        return String.format("Motorcycle={horsePower=%d, type='%s', manufacturer='%s'}", horsePower, type, manufacturer);
    }
}
