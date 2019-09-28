package com.company;

import java.util.List;

public interface CarDao {
    void insert(Car c) throws DbException;

    void delete(Car c);
    void delete(int id);

    void update(Car c, int id);

    Car get(int id) throws DbException;
    List<Car> getAll();
}
