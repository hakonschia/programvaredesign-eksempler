package com.company;

public class VehicleFactory {

    /**
     * Creates a new vehicle
     *
     * @param type The type of vehicle to create
     * @return The newly created vehicle, or null if incorrect input
     */
    public Vehicle createVehicle(String type) {
        type = type.toUpperCase(); // Ensure it's uppercase

        switch(type) {
            case "C":
                return new Car();
            case "B":
                return new Boat();
            case "M":
                return new Motorcycle();
            default:
                return null;
        }
    }

}



