package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarDao carDb;

        boolean connectionMade = false; // A fake connection to demonstrate how to use two different DBs
        if(connectionMade) {
            carDb = new InternetDatabase();
        } else {
            carDb = new LocalDatabase();
        }

        // Insert 2 cars in the DB
        carDb.insert(new Car(1, 2020, "Audi", "RS6"));
        carDb.insert(new Car(2, 2015, "Volkswagen", "Polo"));

        Car c = carDb.get(1); // Get the car with ID 1 (Audi RS6 2020)
        c.setManufacturer("Volkswagen"); // Set the manufacturer to Volkswagen
        carDb.update(c); // Update to Volkswagen RS6 2020

        List<Car> cars = carDb.getAll(); // Retrieve a list of all the cars

        for(Car car : cars) { // Loop through and write the information
            System.out.printf("%s %s (%d) - ID: %d%n", car.getManufacturer(), car.getModel(), car.getYear(), car.getId());
        }
    }
}
