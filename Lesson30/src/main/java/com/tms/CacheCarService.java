package com.tms;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CacheCarService implements CarService {
    CarService carService;

    public CacheCarService(CarService carService) {
        this.carService = carService;
    }

    private List<Car> carsCache = new ArrayList<>();

    @Override
    public Car save(Car car) {
        boolean b = carsCache.stream().anyMatch(car1 -> car1.equals(car));
        if (!b) {
            carsCache.add(car);
            System.out.println("Car " + car + " cached");
        } else {
            System.out.println("The " + car + " is present in the cache");
        }
        System.out.println("Send info to database");
        carService.save(car);
        return car;
    }

    @Override
    public void delete(int id) {
        boolean b = carsCache.stream().anyMatch(car -> car.getId() == id);
        if (b) {
            carsCache.removeIf(car -> car.getId() == id);
            System.out.println("The car from cashes under id " + id + " deleted");
            carService.delete(id);
        } else System.out.println("Car number " + id + " was not found in the cache");
        carService.delete(id);
    }

    @Override
    public void getCar(int id) {
        boolean b = carsCache.stream().anyMatch(car -> car.getId() == id);
        if (b) {
            List<Car> collect = carsCache.stream().filter(car -> car.getId() == id).collect(Collectors.toList());
            System.out.println(collect);
        }
        else {
            System.out.println("Cars under id "+id+" was not found in the cache");
            System.out.println("Go to DataBase");
            carService.getCar(id);
        }

    }

    @Override
    public void deleteAll() {
        carsCache.clear();
        System.out.println("Cars from cache deleted");
        carService.deleteAll();
    }
}
