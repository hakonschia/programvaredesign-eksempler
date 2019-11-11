package com.company;

public class Car extends Vehicle {
    private int numSeats;

    public Car() {
        super.setType("Car");
        super.setManufacturer("Audi");

        this.numSeats = 5;
    }

    @Override
    public String toString() {
        return String.format("Car{numSeats=%d, type='%s', manufacturer='%s'}", numSeats, type, manufacturer);
    }
}


