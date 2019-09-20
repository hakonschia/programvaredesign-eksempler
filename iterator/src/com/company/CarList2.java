package com.company;

public class CarList2 implements CarDataStructure {
    private static final int MAX_ELEMENTS = 10;
    private Car[] cars;
    private int arrayIndex;

    public CarList2() {
        this.cars = new Car[MAX_ELEMENTS];
        arrayIndex = 0;
    }


    @Override
    public CarIterator createIterator() {
        return new CarList2Iterator();
    }

    @Override
    public void addItem(Car car) {
        cars[arrayIndex++] = car;
    }


    private class CarList2Iterator implements CarIterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return arrayIndex > index;
        }

        @Override
        public Car next() {
            return cars[index++];
        }
    }
}
