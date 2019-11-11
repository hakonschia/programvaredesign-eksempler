package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Write C for new car, B for new boat, M for new motorcycle");
        String input = s.next();

        VehicleFactory vehicleFactory = new VehicleFactory(); // Create the factory instance
        Vehicle v = vehicleFactory.createVehicle(input); // The factory is responsible for figuring out what type to create

        if(v != null) { // If the input was not valid, null is returned by createVehicle()
            System.out.printf("A new %s was added (made by %s)%n", v.getType(), v.getManufacturer());
        } else {
            System.out.println("Invalid input");
        }
    }
}
