package com.tms;

public interface CarService {
    Car save(Car car);
    void delete (int id);
    void getCar (int id);
    void deleteAll ();
}
