package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarDatabase implements CarDao {
    private static int ID_NOT_FOUND = -1; // For when a car with given ID is not found in the DB

    private List<Car> cars = new ArrayList<>();

    @Override
    public void insert(Car c) {
        System.out.println("Inserting car");

        int id = c.getId();
        if(this.findPos(id) != ID_NOT_FOUND) { // ID was found, car exists in the DB
            return;
        }

        cars.add(c);
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting car");

        int pos = this.findPos(id);
        cars.remove(pos);
    }

    @Override
    public void delete(Car c) {
        this.delete(c.getId());
    }

    @Override
    public void update(Car c) {
        System.out.println("Updating car");

        int id = c.getId();
        int pos = this.findPos(id);

        if(pos != ID_NOT_FOUND) { // Car was found, update its information
            Car old = cars.get(pos);
            old.setManufacturer(c.getManufacturer());
            old.setModel(c.getModel());
            old.setYear(c.getYear());
        }
        // In this example the update function doesn't do anything, since
        // it's all stored in runtime. In a real example this would update the
        // record with "c"'s ID with the values in "c"
    }

    @Override
    public Car get(int id) {
        int pos = this.findPos(id);
        if(pos == ID_NOT_FOUND) {
            return null;
        }

        return cars.get(pos);
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }


    /**
     * Finds the position of a car in the list
     *
     * @param id The ID of the car to find
     * @return The position in the list, -1 if it's not found
     */
    private int findPos(int id) {
        for(int i = 0; i < cars.size(); i++) {

            int currentId = cars.get(i).getId();
            if(currentId == id) {
                return i;
            }
        }

        return ID_NOT_FOUND;
    }
}
