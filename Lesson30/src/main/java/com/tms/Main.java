package com.tms;
public class Main {
    public static void main(String[] args) {
        DataBaseConnections DB = new DataBaseConnections();
        DB.initialization();
        Car car = new Car("Tesla",1996,1);
        Car car1 = new Car("BMW",2000,2);
        Car car2 = new Car("Audi",2020,3);
        CarService carService = new CacheCarService(new DBCarService());
        carService.save(car);
        carService.save(car1);
        carService.save(car2);

        carService.delete(1);
        carService.getCar(2);
        carService.deleteAll();

    }
}