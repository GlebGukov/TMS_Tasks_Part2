package com.tms.AbstractFactory;

import com.tms.AbstractFactory.myInterface.FactoryCars;
import com.tms.builder.Car;

public class CarService{


    public Car create(FactoryCars factoryCars, String model) {
        return Car.builder().name(model).country(factoryCars.getCountry().infoCountry())
                .type(factoryCars.getType().typeCar()).cost(factoryCars.getCost().priceRange()).build();

    }
}

