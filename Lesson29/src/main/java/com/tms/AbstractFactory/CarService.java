package com.tms.AbstractFactory;

import com.tms.AbstractFactory.myInterface.FactoryCars;
import com.tms.builder.Car;
import com.tms.observer.Men;
import com.tms.observer.Women;

import java.util.Observable;

public class CarService{


    public Car create(FactoryCars factoryCars, String model) {
        Car car = Car.builder().name(model).country(factoryCars.getCountry().infoCountry())
                .type(factoryCars.getType().typeCar()).cost(factoryCars.getCost().priceRange()).build();
        return car;
    }
}


