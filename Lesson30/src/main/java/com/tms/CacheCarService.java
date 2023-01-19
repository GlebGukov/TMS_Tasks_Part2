package com.tms;

import java.util.List;

public class CacheCarService implements CarService{

    List<Car> carsCache;
    public void getAll (){
        carsCache.forEach(x-> System.out.println());
    }

    @Override
    public Car save(Car car) {
        System.out.println("Машина " +car+" в кэше сохранена");
        carsCache.add(car);
        return car;
    }

    @Override
    public void delete(int id) {
        }

    @Override
    public void getCar(int id) {

    }

    @Override
    public void deleteAll() {
        carsCache.clear();
    }
}
