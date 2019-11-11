package com.company;

public class Motorcycle extends Vehicle {
    private int horsePower;

    public Motorcycle() {
        super.setType("Motorcycle");
        super.setManufacturer("Ducati");

        this.horsePower = 115;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "horsePower=" + horsePower +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
