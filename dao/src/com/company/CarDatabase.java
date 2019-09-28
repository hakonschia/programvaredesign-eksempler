package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarDatabase implements CarDao {
    private static int ID_NOT_FOUND = -1;

    List<Car> cars = new ArrayList<>();

    @Override
    public void insert(Car c) throws DbException {
        int id = c.getId();
        if(this.findPos(id) != ID_NOT_FOUND) { // ID was found, car exists in the DB
            throw new DbException("Car with that ID already exists");
        }

        cars.add(c);
    }

    @Override
    public void delete(int id) {
        int pos = this.findPos(id);
        cars.remove(pos);
    }

    @Override
    public void delete(Car c) {
        this.delete(c.getId());
    }

    @Override
    public void update(Car c, int id) {
        int pos = this.findPos(id);

        if(pos != ID_NOT_FOUND) { // Car was found, update its information
            Car old = cars.get(pos);
            old.setManufacturer(c.getManufacturer());
            old.setModel(c.getModel());
            old.setYear(c.getYear());
        }
    }

    @Override
    public Car get(int id) throws DbException {
        int pos = this.findPos(id);
        if(pos == ID_NOT_FOUND) {
            throw new DbException("ID not found");
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
