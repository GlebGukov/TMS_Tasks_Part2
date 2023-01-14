package com.tms;

import com.tms.AbstractFactory.CarService;
import com.tms.AbstractFactory.myImpl.abstractFactoryImpl.BusinessAmericanFactoryCarsImpl;
import com.tms.AbstractFactory.myImpl.abstractFactoryImpl.SportRussianFactoryCarsImpl;
import com.tms.builder.Car;

public class Main {
    public static void main(String[] args) {
        CarService service = new CarService();
        Car car = service.create(new BusinessAmericanFactoryCarsImpl(), "Nissan Altima");
        Car car1 = service.create(new SportRussianFactoryCarsImpl(), "Marussia B2");
        System.out.println(car);
        System.out.println(car1);

    }
}