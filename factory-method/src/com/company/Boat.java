package com.company;

public class Boat extends Vehicle {
    private int maxSpeed;

    public Boat() {
        super.setType("Boat");
        super.setManufacturer("Bertram");

        this.maxSpeed = 50;
    }

    @Override
    public String toString() {
        return String.format("Boat{maxSpeed=%d, type='%s', manufacturer='%s'}", maxSpeed, type, manufacturer);
    }
}

