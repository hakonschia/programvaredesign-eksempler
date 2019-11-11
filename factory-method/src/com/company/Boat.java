package com.company;

public class Boat extends Vehicle {
    private int maxSpeed;

    public Boat() {
        super.setType("Boat");
        super.setManufacturer("Bertram");

        this.maxSpeed = 50;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "maxSpeed=" + maxSpeed +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
