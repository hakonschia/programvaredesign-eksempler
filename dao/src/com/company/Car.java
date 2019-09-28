package com.company;

public class Car {
    private int id;
    private int year;
    private String manufacturer;
    private String model;

    public Car(int id, int year, String manufacturer, String model) {
        this.id = id;
        this.year = year;
        this.manufacturer = manufacturer;
        this.model = model;
    }


    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
