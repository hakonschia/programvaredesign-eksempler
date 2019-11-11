package com.company;

public class Car extends Vehicle {
    private int numSeats;

    public Car() {
        super.setType("Car");
        super.setManufacturer("Audi");

        this.numSeats = 5;
    }

    public int getNumSeats() {
        return this.numSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numSeats=" + numSeats +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}


