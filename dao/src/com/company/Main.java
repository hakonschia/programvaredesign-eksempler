package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarDao carDb = new CarDatabase();

        try {
            carDb.insert(new Car(1, 2020, "Audi", "RS6"));
        } catch (DbException dbException) {
            dbException.printStackTrace();
        }

        Car k = new Car(1, 2013, "ff", "ef2");
        carDb.update(k, 1);

        List<Car> cccc = carDb.getAll();

        for(Car c : cccc) {
            System.out.println(c.getManufacturer());
        }
    }
}
