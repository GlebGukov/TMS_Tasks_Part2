package com.tms.AbstractFactory;

import com.tms.AbstractFactory.myInterface.FactoryCars;
import com.tms.builder.Car;

public class CarService {


    public Car create(FactoryCars factoryCars,String model){
        Car car = Car.builder().name(model).country(factoryCars.getCountry().infoCountry())
                .type(factoryCars.getType().typeCar()).cost(factoryCars.getCost().priceRange()).build();
        return car;
    }

    public void search(FactoryCars factoryCars){
//        List<String> strings = new ArrayList<>(Arrays.asList(options));
//        if (strings.contains("America")){
        Car porshe = Car.builder().name("porshe").country(factoryCars.getCountry().infoCountry())
                .type(factoryCars.getType().typeCar())
                .cost(factoryCars.getCost().priceRange()).build();
        System.out.println(porshe);


    }
    }

