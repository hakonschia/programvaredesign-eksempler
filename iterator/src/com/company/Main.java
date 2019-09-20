package com.company;

public class Main {

    public static void main(String[] args) {
        CarList1 list1 = new CarList1(); // This data structure uses an ArrayList
        CarList2 list2 = new CarList2(); // This data structure uses a primitive array

        list1.addItem(new Car("Audi", "RS6", 2020));
        list1.addItem(new Car("Volkswagen", "Polo", 2015));

        list2.addItem(new Car("Toyota", "Auris", 2014));
        list2.addItem(new Car("Fiat", "500", 2017));

        System.out.println("------- Car list 1 -------");
        printCars(list1);

        System.out.println("\n------- Car list 2 -------");
        printCars(list2);
    }

    /**
     * Prints out all the cars
     *
     * @param cars The data structure with the cars to print out
     */
    private static void printCars(CarDataStructure cars) {
        CarIterator i = cars.createIterator();

        // With the use of an iterator, the different CarDataStructure implementations doesn't matter
        while(i.hasNext()) {
            Car c = i.next();

            System.out.printf("%s %s (%d)\n", c.getManufacturer(), c.getModel(), c.getYear());
        }
    }
}
