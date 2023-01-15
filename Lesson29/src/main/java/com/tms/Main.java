package com.tms;

import com.tms.AbstractFactory.CarService;
import com.tms.AbstractFactory.myImpl.abstractFactoryImpl.BusinessAmericanFactoryCarsImpl;
import com.tms.AbstractFactory.myImpl.abstractFactoryImpl.SportRussianFactoryCarsImpl;
import com.tms.builder.Car;
import com.tms.observer.EventManagers;
import com.tms.observer.Men;
import com.tms.observer.Women;

public class Main {
    public static void main(String[] args) {
        CarService service = new CarService();
        EventManagers eventManagers = new EventManagers();

        Men volodya = Men.builder().name("Volodya").build();
        Women katya = Women.builder().name("Katya").build();

        eventManagers.addObserver(volodya);
        eventManagers.addObserver(katya);

        Car car = service.create(new BusinessAmericanFactoryCarsImpl(), "Nissan Altima");
        Car car1 = service.create(new SportRussianFactoryCarsImpl(), "Marussia B2");

        eventManagers.addEvent(car.getName());
        eventManagers.addEvent(car1.getName());

        System.out.println(car);
        System.out.println(car1);


    }
}