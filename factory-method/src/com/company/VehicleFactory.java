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

        Vehicle v = null; // The vehicle to return

        switch(type) {
            case "C":
                v = new Car();
                break;
            case "B":
                v = new Boat();
                break;
            case "M":
                v = new Motorcycle();
                break;
            default:
                break;
        }

        return v;
    }

}



