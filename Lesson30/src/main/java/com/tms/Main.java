package com.tms;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla",1996,1);
        Car car1 = new Car("BMW",2000,2);
        MachineOperations operationsDB = new DataBaseImpl();
//        operationsDB.save(car1);
//        operationsDB.delete(2);
        operationsDB.carId(2);
    }
}