package com.company;

import java.util.List;

public interface CarDao {
    void insert(Car c);

    void delete(Car c);
    void delete(int id);

    void update(Car c);

    Car get(int id);
    List<Car> getAll();
}
