package com.tms;
public class Main {
    public static void main(String[] args) {
        DataBaseConnections DB = new DataBaseConnections();
        DB.initialization();
        Car car = new Car("Tesla",1996,1);
        Car car1 = new Car("BMW",2000,2);
        CarService carService = new DBCarService(new CacheCarService());
        carService.save(car);
        carService.save(car1);
        carService.deleteAll();

    }
}