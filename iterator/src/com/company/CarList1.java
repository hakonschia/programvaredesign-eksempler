package com.company;

import java.util.ArrayList;

/**
 * Data structure that holds cars by using an ArrayList
 */
public class CarList1 implements CarDataStructure {
    private ArrayList<Car> cars;

    public CarList1() {
        cars = new ArrayList<>();
    }

    @Override
    public CarIterator createIterator() {
        return new CarList1Ierator();
    }

    @Override
    public void addItem(Car c) {
        cars.add(c);
    }


    private class CarList1Ierator implements CarIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return cars.size() > index;
        }

        @Override
        public Car next() {
            return cars.get(index++);
        }
    }
}
